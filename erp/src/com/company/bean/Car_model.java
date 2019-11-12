package com.company.bean;

/**
 * @author yd
 * @category 商品车型号
 */
public class Car_model {
	     /**
		 * 型号ID
		 */
		private int modelId;
		
		 /**
		 * 型号名称
		 */
		private String model;

		public int getModelId() {
			return modelId;
		}

		public void setModelId(int modelId) {
			this.modelId = modelId;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public Car_model(int modelId, String model) {
			super();
			this.modelId = modelId;
			this.model = model;
		}

		public Car_model() {
			super();
		}
		
		
}
