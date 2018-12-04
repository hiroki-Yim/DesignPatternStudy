package TemplateMethodPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Report {
	protected List<Customer> list;
	protected String report = "";

	public String generate(List<Customer> costomer) {
		List<Customer> list = filter(costomer);
		// String report = String.format("고객 수: %d명\n",list.size()); 를 header를 불러와서
		// 

		header(list);
		for (int i = 0; i < list.size(); i++) {
			Customer customer = list.get(i);
			report += String.format("%s: %d\n", customer.getName(), customer.getPoint());
		}
		footer(list);

		return report;
	}

	protected List<Customer> filter(List<Customer> customers) {
		List<Customer> list = new ArrayList<Customer>();
		for (int i = 0; i < customers.size(); i++) {
			Customer customer = customers.get(i);
			if (filterCondition(customer)) {
				list.add(customer);
			}
			;
		}
		return list;
	}

	protected abstract void header(List<Customer> customers);

	protected abstract void footer(List<Customer> customers);

	protected abstract boolean filterCondition(Customer customer);
}