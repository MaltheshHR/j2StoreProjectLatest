package com.j2storeProject.dataprovider;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;

import com.j2storeProject.utility.NewExcelLibrary;

public class DataProviders {

	NewExcelLibrary obj = new NewExcelLibrary();

	@DataProvider(name = "blogs")
	public Object[][] getCredentials() {
		// Totals rows count
		int rows = obj.getRowCount("blogs");
		// Total Columns
		int column = obj.getColumnCount("blogs");
		int actRows = rows - 1;

		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = obj.getCellData("blogs", j, i + 2);
			}
		}
		return data;
	}

	@DataProvider(name = "customerInformation")
	public Object[][] accountCreation() {
		int rows = obj.getRowCount("customerInformation");
		int column = obj.getColumnCount("customerInformation");
		int actRows = rows - 1;
		Object[][] data = new Object[actRows][1];
		for (int i = 0; i < actRows; i++) {
			Map<String, String> hashMap = new HashMap<>();
			for (int j = 0; j < column; j++) {
				hashMap.put(obj.getCellData("customerInformation", j, 1),
						obj.getCellData("customerInformation", j, i + 2));
			}
			data[i][0] = hashMap;
		}
		return data;
	}

}
