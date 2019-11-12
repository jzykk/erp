package com.company.action;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.util.Captcha;

/**
 * @author Davi
 * @category 验证码控制器
 */
@WebServlet("/captcha.action")
public class CreateCaptchaAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CreateCaptchaAction() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setDateHeader("Expires", 0);
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0");
		response.setHeader("Pragma", "no-cache");
		response.setContentType("image/jpeg");

		OutputStream os = response.getOutputStream();
		// 返回验证码和图片的map
		Map<String, Object> map = Captcha.getImageCode(86, 37, os);
		String simpleCaptcha = "simpleCaptcha";
		request.getSession().setAttribute(simpleCaptcha, map.get("strEnsure").toString().toLowerCase());
		request.getSession().setAttribute("codeTime", new Date().getTime());
		try {
			ImageIO.write((BufferedImage) map.get("image"), "jpg", os);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} finally {
			if (os != null) {
				os.flush();
				os.close();
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
