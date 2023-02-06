class PackageInfo
{
	public static void main(String args[])
	{
		Package p=Package.getPackage("java.lang");
		System.out.println("package name: "+p.getName());
		System.out.println("specification title: "+p.getSpecificationTitle());
		System.out.println("vender: "+p.getSpecificationVendor());
		System.out.println("version: "+p.getSpecificationVersion());
		System.out.println("implementation Title: "+p.getImplementationTitle());
		System.out.println("implementation vendor: "+p.getImplementationVendor());
		System.out.println("implementation Version: "+p.getImplementationVersion());
		System.out.println("is called: "+p.isSealed());
	}
}