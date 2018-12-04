package TemplateMethodPattern;

import java.util.List;

public class SimpleReportGenerator extends Report {

	protected void header(List<Customer> customers) {
		super.report += String.format("고객 수 : %d명 \n", customers.size());
	}

	protected boolean filterCondition(Customer customer) {
		return customer.getPoint() >= 0;
	}

	protected List<Customer> filter(List<Customer> customers) {
		return customers;
	}

	protected void footer(List<Customer> customers) {

	}
}
