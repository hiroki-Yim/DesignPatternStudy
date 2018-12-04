package TemplateMethodPattern;

import java.util.List;

public class ComplexReportGenerator extends Report{
	
	protected boolean filterCondition(Customer customer) {
		return customer.getPoint() >= 100;
	}

	protected void header(List<Customer> customers) {
		super.report += String.format("고객 수 : %d명 입니다. \n",customers.size());
	};
	
	protected void footer(List<Customer> customers) {
		int sum = 0;
		for(int i = 0; i < customers.size(); i++) {
			sum += customers.get(i).getPoint();
		}
		super.report+=String.format("점수 합계 : %d\n", sum);
	}
}
