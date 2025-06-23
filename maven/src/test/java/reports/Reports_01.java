package reports;

import dynamic_code.Dynamic_Reports;

public class Reports_01 extends Dynamic_Reports  {

	public static void main(String[] args) throws Throwable {
		
		Extent_reports("amazon website", "Amazon Reports", "https://www.amazon.in/", "Amazon", "Reports_01", "ReportsSc", "information of test cases","test cases passed", "test case failed", "skipped functionality");
		Launch_01("chrome");
		HitUrl("https://www.amazon.in/");
		
			Screenshot("sc123");
		
	

	}

}
