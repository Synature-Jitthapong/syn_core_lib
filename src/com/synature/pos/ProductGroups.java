package com.synature.pos;

import java.util.ArrayList;
import java.util.List;

public class ProductGroups {
	
	private List<ProductGroup> ProductGroup = new ArrayList<ProductGroup>();
	private List<ProductDept> ProductDept = new ArrayList<ProductDept>();
	private List<Products> Products = new ArrayList<Products>();
	private List<ProductComponent> ProductComponent = new ArrayList<ProductComponent>();
	private List<PComponentGroup> PComponentGroup = new ArrayList<PComponentGroup>();
	private List<ProductComponent> PComponentSet = new ArrayList<ProductComponent>();
	private List<CommentProduct> CommentProduct = new ArrayList<CommentProduct>();
	private List<SaleMode> SaleMode = new ArrayList<SaleMode>();
	private List<Promotion> PromotionPriceGroup = new ArrayList<Promotion>();

	public List<Promotion> getPromotionPriceGroup() {
		return PromotionPriceGroup;
	}

	public void setPromotionPriceGroup(List<Promotion> promotionPriceGroup) {
		PromotionPriceGroup = promotionPriceGroup;
	}

	public List<Products> getProducts() {
		return Products;
	}

	public List<ProductComponent> getPComponentSet() {
		return PComponentSet;
	}

	public void setPComponentSet(List<ProductComponent> pComponentSet) {
		PComponentSet = pComponentSet;
	}

	public void setProducts(List<Products> products) {
		Products = products;
	}

	public List<SaleMode> getSaleMode() {
		return SaleMode;
	}

	public void setSaleMode(List<SaleMode> saleMode) {
		SaleMode = saleMode;
	}

	public List<CommentProduct> getCommentProduct() {
		return CommentProduct;
	}

	public void setCommentProduct(List<CommentProduct> commentProduct) {
		CommentProduct = commentProduct;
	}

	public List<PComponentGroup> getPComponentGroup() {
		return PComponentGroup;
	}

	public void setPComponentGroup(List<PComponentGroup> pComponentGroup) {
		PComponentGroup = pComponentGroup;
	}

	public List<ProductGroup> getProductGroup() {
		return ProductGroup;
	}

	public void setProductGroup(List<ProductGroup> productGroup) {
		this.ProductGroup = productGroup;
	}

	public List<ProductDept> getProductDept() {
		return ProductDept;
	}

	public void setProductDept(List<ProductDept> productDept) {
		ProductDept = productDept;
	}

	public List<Products> getProduct() {
		return Products;
	}

	public void setProduct(List<Products> product) {
		Products = product;
	}

	public List<ProductComponent> getProductComponent() {
		return ProductComponent;
	}

	public void setProductComponent(List<ProductComponent> productComponent) {
		ProductComponent = productComponent;
	}
	
	public static class SaleMode{
		private int SaleModeID;
		private String SaleModeName;
		private int PositionPrefix;
		private String PrefixText;
		private String PrefixQueue;
		private boolean isSelected;
		
		public boolean isSelected() {
			return isSelected;
		}
		public void setSelected(boolean isSelected) {
			this.isSelected = isSelected;
		}
		public int getSaleModeID() {
			return SaleModeID;
		}
		public void setSaleModeID(int saleModeID) {
			SaleModeID = saleModeID;
		}
		public String getSaleModeName() {
			return SaleModeName;
		}
		public void setSaleModeName(String saleModeName) {
			SaleModeName = saleModeName;
		}
		public int getPositionPrefix() {
			return PositionPrefix;
		}
		public void setPositionPrefix(int positionPrefix) {
			PositionPrefix = positionPrefix;
		}
		public String getPrefixText() {
			return PrefixText;
		}
		public void setPrefixText(String prefixText) {
			PrefixText = prefixText;
		}
		public String getPrefixQueue() {
			return PrefixQueue;
		}
		public void setPrefixQueue(String prefixQueue) {
			PrefixQueue = prefixQueue;
		}
	}
	
	public static class ProductGroup {
		private int ProductGroupID;
		private String ProductGroupCode;
		private String ProductGroupName;
		private int ProductGroupOrdering;
		private int IsComment;
		private int ProductGroupType;
		private String UpdateDate;

		public void setProductGroupName(String productGroupName) {
			this.ProductGroupName = productGroupName;
		}

		public int getProductGroupOrdering() {
			return ProductGroupOrdering;
		}

		public void setProductGroupOrdering(int productGroupOrdering) {
			this.ProductGroupOrdering = productGroupOrdering;
		}

		public int getIsComment() {
			return IsComment;
		}

		public void setIsComment(int isComment) {
			this.IsComment = isComment;
		}

		public int getProductGroupType() {
			return ProductGroupType;
		}

		public void setProductGroupType(int productGroupType) {
			this.ProductGroupType = productGroupType;
		}

		public String getUpdateDate() {
			return UpdateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.UpdateDate = updateDate;
		}

		public int getProductGroupId() {
			return ProductGroupID;
		}

		public void setProductGroupId(int productGroupId) {
			this.ProductGroupID = productGroupId;
		}

		public String getProductGroupCode() {
			return ProductGroupCode;
		}

		public void setProductGroupCode(String productGroupCode) {
			this.ProductGroupCode = productGroupCode;
		}

		public String getProductGroupName() {
			return ProductGroupName;
		}
	}

	public static class ProductDept {
		private int ProductDeptID;
		private int ProductGroupID;
		private String ProductDeptCode;
		private String ProductDeptName;
		private int ProductDeptOrdering;
		private String UpdateDate;
		
		public int getProductDeptOrdering() {
			return ProductDeptOrdering;
		}
		
		public void setProductDeptOrdering(int productDeptOrdering) {
			ProductDeptOrdering = productDeptOrdering;
		}
		public int getProductDeptID() {
			return ProductDeptID;
		}
		public void setProductDeptID(int productDeptID) {
			ProductDeptID = productDeptID;
		}
		public int getProductGroupID() {
			return ProductGroupID;
		}
		public void setProductGroupID(int productGroupID) {
			ProductGroupID = productGroupID;
		}
		public String getProductDeptCode() {
			return ProductDeptCode;
		}
		public void setProductDeptCode(String productDeptCode) {
			ProductDeptCode = productDeptCode;
		}
		public String getProductDeptName() {
			return ProductDeptName;
		}
		public void setProductDeptName(String productDeptName) {
			ProductDeptName = productDeptName;
		}
		public String getUpdateDate() {
			return UpdateDate;
		}
		public void setUpdateDate(String updateDate) {
			UpdateDate = updateDate;
		}
	}

	public static class CommentProduct{
		private int ProductID;
		private int CommentID;
		public int getProductID() {
			return ProductID;
		}
		public void setProductID(int productID) {
			ProductID = productID;
		}
		public int getCommentID() {
			return CommentID;
		}
		public void setCommentID(int commentID) {
			CommentID = commentID;
		}
	}
	
	public static class Products{
		private int ProductID;
		private int ProductDeptID;
		private int ProductGroupID;
		private String ProductCode;
		private String ProductBarCode;
		private int ProductTypeID;
		private double ProductPricePerUnit;
		private String ProductUnitName;
		private String ProductDesc;
		private int DiscountAllow;
		private int PrinterID;
		private int PrintGroup;
		private int VatType;
		private double VatRate;
		private int HasServiceCharge;
		private int Activate;
		private int IsOutOfStock;
		private int SaleMode1;
		private double ProductPricePerUnit1;
		private int SaleMode2;
		private double ProductPricePerUnit2;
		private int SaleMode3;
		private double ProductPricePerUnit3;
		private int SaleMode4;
		private double ProductPricePerUnit4;
		private int SaleMode5;
		private double ProductPricePerUnit5;
		private String UpdateDate;
		
		
		public double getProductPricePerUnit1() {
			return ProductPricePerUnit1;
		}
		public void setProductPricePerUnit1(double productPricePerUnit1) {
			ProductPricePerUnit1 = productPricePerUnit1;
		}
		public double getProductPricePerUnit2() {
			return ProductPricePerUnit2;
		}
		public void setProductPricePerUnit2(double productPricePerUnit2) {
			ProductPricePerUnit2 = productPricePerUnit2;
		}
		public double getProductPricePerUnit3() {
			return ProductPricePerUnit3;
		}
		public void setProductPricePerUnit3(double productPricePerUnit3) {
			ProductPricePerUnit3 = productPricePerUnit3;
		}
		public double getProductPricePerUnit4() {
			return ProductPricePerUnit4;
		}
		public void setProductPricePerUnit4(double productPricePerUnit4) {
			ProductPricePerUnit4 = productPricePerUnit4;
		}
		public double getProductPricePerUnit5() {
			return ProductPricePerUnit5;
		}
		public void setProductPricePerUnit5(double productPricePerUnit5) {
			ProductPricePerUnit5 = productPricePerUnit5;
		}
		public void setProductPricePerUnit(double productPricePerUnit) {
			ProductPricePerUnit = productPricePerUnit;
		}
		public void setVatRate(double vatRate) {
			VatRate = vatRate;
		}
		public int getProductID() {
			return ProductID;
		}
		public void setProductID(int productID) {
			ProductID = productID;
		}
		public int getActivate() {
			return Activate;
		}
		public void setActivate(int activate) {
			Activate = activate;
		}
		public int getProductDeptID() {
			return ProductDeptID;
		}
		public void setProductDeptID(int productDeptID) {
			ProductDeptID = productDeptID;
		}
		public int getProductGroupID() {
			return ProductGroupID;
		}
		public void setProductGroupID(int productGroupID) {
			ProductGroupID = productGroupID;
		}
		public String getProductCode() {
			return ProductCode;
		}
		public void setProductCode(String productCode) {
			ProductCode = productCode;
		}
		public String getProductBarCode() {
			return ProductBarCode;
		}
		public void setProductBarCode(String productBarCode) {
			ProductBarCode = productBarCode;
		}
		public int getProductTypeID() {
			return ProductTypeID;
		}
		public void setProductTypeID(int productTypeID) {
			ProductTypeID = productTypeID;
		}
		
		public double getProductPricePerUnit() {
			return ProductPricePerUnit;
		}
		public String getProductUnitName() {
			return ProductUnitName;
		}
		public void setProductUnitName(String productUnitName) {
			ProductUnitName = productUnitName;
		}
		public String getProductDesc() {
			return ProductDesc;
		}
		public void setProductDesc(String productDesc) {
			ProductDesc = productDesc;
		}
		public int getDiscountAllow() {
			return DiscountAllow;
		}
		public void setDiscountAllow(int discountAllow) {
			DiscountAllow = discountAllow;
		}
		public int getPrinterID() {
			return PrinterID;
		}
		public void setPrinterID(int printerID) {
			PrinterID = printerID;
		}
		public int getPrintGroup() {
			return PrintGroup;
		}
		public void setPrintGroup(int printGroup) {
			PrintGroup = printGroup;
		}
		public int getVatType() {
			return VatType;
		}
		public void setVatType(int vatType) {
			VatType = vatType;
		}
		public double getVatRate() {
			return VatRate;
		}
		public int getHasServiceCharge() {
			return HasServiceCharge;
		}
		public void setHasServiceCharge(int hasServiceCharge) {
			HasServiceCharge = hasServiceCharge;
		}
		public int getIsOutOfStock() {
			return IsOutOfStock;
		}
		public void setIsOutOfStock(int isOutOfStock) {
			IsOutOfStock = isOutOfStock;
		}
		public int getSaleMode1() {
			return SaleMode1;
		}
		public void setSaleMode1(int saleMode1) {
			SaleMode1 = saleMode1;
		}
		public int getSaleMode2() {
			return SaleMode2;
		}
		public void setSaleMode2(int saleMode2) {
			SaleMode2 = saleMode2;
		}
		public int getSaleMode3() {
			return SaleMode3;
		}
		public void setSaleMode3(int saleMode3) {
			SaleMode3 = saleMode3;
		}
		public int getSaleMode4() {
			return SaleMode4;
		}
		public void setSaleMode4(int saleMode4) {
			SaleMode4 = saleMode4;
		}
		public int getSaleMode5() {
			return SaleMode5;
		}
		public void setSaleMode5(int saleMode5) {
			SaleMode5 = saleMode5;
		}
		public String getUpdateDate() {
			return UpdateDate;
		}
		public void setUpdateDate(String updateDate) {
			UpdateDate = updateDate;
		}
	}

	public static class ProductComponent{
		private int PGroupID;
        private int ProductID;
        private int SaleMode;
        private int ChildProductID;
        private double ChildProductAmount;
        private double FlexibleProductPrice;
        private int FlexibleIncludePrice;
        
		public int getPGroupID() {
			return PGroupID;
		}
		public void setPGroupID(int pGroupID) {
			PGroupID = pGroupID;
		}
		public int getProductID() {
			return ProductID;
		}
		public void setProductID(int productID) {
			ProductID = productID;
		}
		public int getSaleMode() {
			return SaleMode;
		}
		public void setSaleMode(int saleMode) {
			SaleMode = saleMode;
		}
		public int getChildProductID() {
			return ChildProductID;
		}
		public void setChildProductID(int childProductID) {
			ChildProductID = childProductID;
		}
		public double getChildProductAmount() {
			return ChildProductAmount;
		}
		public void setChildProductAmount(double childProductAmount) {
			ChildProductAmount = childProductAmount;
		}
		public double getFlexibleProductPrice() {
			return FlexibleProductPrice;
		}
		public void setFlexibleProductPrice(double flexibleProductPrice) {
			FlexibleProductPrice = flexibleProductPrice;
		}
		public int getFlexibleIncludePrice() {
			return FlexibleIncludePrice;
		}
		public void setFlexibleIncludePrice(int flexibleIncludePrice) {
			FlexibleIncludePrice = flexibleIncludePrice;
		}
	}
	
	public static class PComponentGroup extends ProductComponent{
		private int SetGroupNo;
		private String SetGroupName;
		private double RequireAmount;
		
		public int getSetGroupNo() {
			return SetGroupNo;
		}
		public void setSetGroupNo(int setGroupNo) {
			SetGroupNo = setGroupNo;
		}
		public String getSetGroupName() {
			return SetGroupName;
		}
		public void setSetGroupName(String setGroupName) {
			SetGroupName = setGroupName;
		}
		public double getRequireAmount() {
			return RequireAmount;
		}
		public void setRequireAmount(double requireAmount) {
			RequireAmount = requireAmount;
		}
	}
	
	public static class Promotion{
		private int PriceGroupID;
	    private int PromotionTypeID;
	    private String PromotionCode;
	    private String PromotionName;
	    private String ButtonName;				// if this not set use PromotionName
	    private String CouponHeader;
	    private String PriceFromDate;
	    private String PriceToDate;
	    private String PriceFromTime;
	    private String PriceToTime;
	    private String PromotionWeekly;
	    private String PromotionMonthly;
	    private int IsAllowUseOtherPromotion;
	    private double VoucherAmount;
	    private double OverPrice; 				// if price over this allow discount
	    private int PromotionAmountType;
	    
		public int getPriceGroupID() {
			return PriceGroupID;
		}
		public void setPriceGroupID(int priceGroupID) {
			PriceGroupID = priceGroupID;
		}
		public int getPromotionTypeID() {
			return PromotionTypeID;
		}
		public void setPromotionTypeID(int promotionTypeID) {
			PromotionTypeID = promotionTypeID;
		}
		public String getPromotionCode() {
			return PromotionCode;
		}
		public void setPromotionCode(String promotionCode) {
			PromotionCode = promotionCode;
		}
		public String getPromotionName() {
			return PromotionName;
		}
		public void setPromotionName(String promotionName) {
			PromotionName = promotionName;
		}
		public String getButtonName() {
			return ButtonName;
		}
		public void setButtonName(String buttonName) {
			ButtonName = buttonName;
		}
		public String getCouponHeader() {
			return CouponHeader;
		}
		public void setCouponHeader(String couponHeader) {
			CouponHeader = couponHeader;
		}
		public String getPriceFromDate() {
			return PriceFromDate;
		}
		public void setPriceFromDate(String priceFromDate) {
			PriceFromDate = priceFromDate;
		}
		public String getPriceToDate() {
			return PriceToDate;
		}
		public void setPriceToDate(String priceToDate) {
			PriceToDate = priceToDate;
		}
		public String getPriceFromTime() {
			return PriceFromTime;
		}
		public void setPriceFromTime(String priceFromTime) {
			PriceFromTime = priceFromTime;
		}
		public String getPriceToTime() {
			return PriceToTime;
		}
		public void setPriceToTime(String priceToTime) {
			PriceToTime = priceToTime;
		}
		public String getPromotionWeekly() {
			return PromotionWeekly;
		}
		public void setPromotionWeekly(String promotionWeekly) {
			PromotionWeekly = promotionWeekly;
		}
		public String getPromotionMonthly() {
			return PromotionMonthly;
		}
		public void setPromotionMonthly(String promotionMonthly) {
			PromotionMonthly = promotionMonthly;
		}
		public int getIsAllowUseOtherPromotion() {
			return IsAllowUseOtherPromotion;
		}
		public void setIsAllowUseOtherPromotion(int isAllowUseOtherPromotion) {
			IsAllowUseOtherPromotion = isAllowUseOtherPromotion;
		}
		public double getVoucherAmount() {
			return VoucherAmount;
		}
		public void setVoucherAmount(double voucherAmount) {
			VoucherAmount = voucherAmount;
		}
		public double getOverPrice() {
			return OverPrice;
		}
		public void setOverPrice(double overPrice) {
			OverPrice = overPrice;
		}
		public int getPromotionAmountType() {
			return PromotionAmountType;
		}
		public void setPromotionAmountType(int promotionAmountType) {
			PromotionAmountType = promotionAmountType;
		}
	}
}
