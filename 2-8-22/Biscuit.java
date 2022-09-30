class Biscuit
{
String brand;
double price;
int expDate;
double weight;
String manufacturedBy;
double quantity;
int noOfPieces;

Biscuit()
{
	
}
Biscuit(String brand)
{
	this();
	this.brand=brand;
}
Biscuit(String brand,double price)
{
	this(brand);
	this.price=price;
}
Biscuit(String brand,double price,int expDate)
{
	this(brand,price);
	this.expDate=expDate;
}
Biscuit(String brand,double price,int expDate,double weight)
{
	this(brand,price,expDate);
	this.weight=weight;
}
Biscuit(String brand,double price,int expDate,double weight,String manufacturedBy)
{
	this(brand,price,expDate,weight);
	this.manufacturedBy=manufacturedBy;
}
Biscuit(String brand,double price,int expDate,double weight,String manufacturedBy,double quantity)
{
	this(brand,price,expDate,weight,manufacturedBy);
	this.quantity=quantity;
}

Biscuit(String brand,double price,int expDate,double weight,String manufacturedBy,double quantity,int noOfPieces)
{
	this(brand,price,expDate,weight,manufacturedBy,quantity);
	this.noOfPieces=noOfPieces;
}


}