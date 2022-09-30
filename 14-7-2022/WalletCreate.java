class WalletCreate
{
	public static void main(String[] wallet)
	{
	Wallet.wallet();
	Wallet.name("Mens Wallet");
	Wallet.type("Leather","Non Leather");
	Wallet.brands("Puma","Bellroy","Tommy Hilfiger");
    String [] a = {"Blue","Brown","Black","White"};
	Wallet.color(a);
	Wallet.purchaseAddress(85,"Vijay Nagar","Hubli","Dharwad",580028);
	}
}