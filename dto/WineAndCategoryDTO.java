package com.sixmmelie.wine.winecellar.dto;

public class WineAndCategoryDTO {
	
	private CategoryDTO category;
	private int wineCode;
	private String wineNameKo;
	private String wineNameEn;
	private String wineArea;
	private String wineContent;
	private String wineImg;
	private int winePrice;
	private int wineStock;
	private int wineSales;
	private double alcoholLevel;
	private int nationCode;
	
	public WineAndCategoryDTO() {
		super();
	}
	
	public WineAndCategoryDTO(CategoryDTO category, int wineCode, String wineNameKo, String wineNameEn, String wineArea,
			String wineContent, String wineImg, int winePrice, int wineStock, int wineSales, double alcoholLevel,
			int nationCode) {
		super();
		this.category = category;
		this.wineCode = wineCode;
		this.wineNameKo = wineNameKo;
		this.wineNameEn = wineNameEn;
		this.wineArea = wineArea;
		this.wineContent = wineContent;
		this.wineImg = wineImg;
		this.winePrice = winePrice;
		this.wineStock = wineStock;
		this.wineSales = wineSales;
		this.alcoholLevel = alcoholLevel;
		this.nationCode = nationCode;
	}
	
	public CategoryDTO getCategory() {
		return category;
	}
	public void setCategory(CategoryDTO category) {
		this.category = category;
	}
	public int getWineCode() {
		return wineCode;
	}
	public void setWineCode(int wineCode) {
		this.wineCode = wineCode;
	}
	public String getWineNameKo() {
		return wineNameKo;
	}
	public void setWineNameKo(String wineNameKo) {
		this.wineNameKo = wineNameKo;
	}
	public String getWineNameEn() {
		return wineNameEn;
	}
	public void setWineNameEn(String wineNameEn) {
		this.wineNameEn = wineNameEn;
	}
	public String getWineArea() {
		return wineArea;
	}
	public void setWineArea(String wineArea) {
		this.wineArea = wineArea;
	}
	public String getWineContent() {
		return wineContent;
	}
	public void setWineContent(String wineContent) {
		this.wineContent = wineContent;
	}
	public String getWineImg() {
		return wineImg;
	}
	public void setWineImg(String wineImg) {
		this.wineImg = wineImg;
	}
	public int getWinePrice() {
		return winePrice;
	}
	public void setWinePrice(int winePrice) {
		this.winePrice = winePrice;
	}
	public int getWineStock() {
		return wineStock;
	}
	public void setWineStock(int wineStock) {
		this.wineStock = wineStock;
	}
	public int getWineSales() {
		return wineSales;
	}
	public void setWineSales(int wineSales) {
		this.wineSales = wineSales;
	}
	public double getAlcoholLevel() {
		return alcoholLevel;
	}
	public void setAlcoholLevel(double alcoholLevel) {
		this.alcoholLevel = alcoholLevel;
	}
	public int getNationCode() {
		return nationCode;
	}
	public void setNationCode(int nationCode) {
		this.nationCode = nationCode;
	}
	@Override
	public String toString() {
		return "WineAndCategoryDTO [category=" + category + ", wineCode=" + wineCode + ", wineNameKo=" + wineNameKo
				+ ", wineNameEn=" + wineNameEn + ", wineArea=" + wineArea + ", wineContent=" + wineContent
				+ ", wineImg=" + wineImg + ", winePrice=" + winePrice + ", wineStock=" + wineStock + ", wineSales="
				+ wineSales + ", alcoholLevel=" + alcoholLevel + ", nationCode=" + nationCode + "]";
	}


}
