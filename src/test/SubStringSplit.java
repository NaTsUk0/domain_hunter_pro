package test;

public class SubStringSplit {
	public static void main(String[] args) {
		String item = "www.baidu.com";
		String rootDomain =".baidu.com";
		String str = item.substring(0,item.indexOf(rootDomain));
		String str1 = item.split(rootDomain)[0];
		System.out.println(str);
		System.out.println(str1);
	}

}
