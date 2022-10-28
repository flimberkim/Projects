package me.smartstore.project;

import me.smartstore.project.Customer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.logging.Level;


public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {


		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		Customer[] customer = new Customer[10];
		Customer[] gen = new Customer[10];
		Customer[] v = new Customer[10];
		Customer[] vv = new Customer[10];
		Customer[] others = new Customer[10];
		Customer temp = new Customer("llll", "abcd");
		String groupType;
		String inputWord;
		int num = 1;
		int temp1 = 0;
		int currentPosition = 0; //customer 배열에서 마지막 커서의 개념
		int variable = 0;
		Level general = new Level();
		Level vip = new Level();
		Level vvip = new Level();

		//시작화면 출력
		System.out.print("\n===========================================\n" +
				" Title : SmartStore Customer Segmentation\n" +
				" Release Date : 22.10.21\n" +
				" Copyright 2022 Wooseok All rights reserved.\n" +
				"===========================================\n" +
				"\n");

		//화면전환부분
		restart16:
		while (true) {
			System.out.print("\n" +
					"==============================\n" +
					" 1. Classification Parameter\n" +
					" 2. Customer Data\n" +
					" 3. Summary\n" +
					" 4. Quit\n" +
					"==============================\n" +
					"Choose One: ");
			try{//잘못된 숫자나 문자를 입력했을 경우 예외 처리
				variable = Integer.parseInt(input.readLine());
				if((variable < 1) || (variable > 4)){
					System.out.println("Invalid input!! Please try again!");
					continue restart16;
				}
			}
			catch(Exception e){
				System.out.println("Invalid input!! Please try again!");
				continue restart16;
			}
			switch (variable) {
				case 1://Classification Parameter
					restart:
					while(true) {
						System.out.print("\n==============================\n" +
								" 1. Set Parameter\n" +
								" 2. View Parameter\n" +
								" 3. Update Parameter\n" +
								" 4. Back\n" +
								"==============================\n" +
								"Choose One: ");
						try{
							variable = Integer.parseInt(input.readLine());
							if((variable < 1) || (variable > 4)){
								System.out.println("Invalid input!! Please try again!");
								continue restart16;
							}
						}
						catch(Exception e){
							System.out.println("Invalid input!! Please try again!");
							continue restart;
						}
						switch (variable) {
							case 1: //set parameter
								restart9:
								while(true) {
									System.out.print("** Press 'end', if you want to exit! **\n" +
											"Which group (GENERAL, VIP, VVIP)? ");

									try{
										groupType = input.readLine().toUpperCase();
										if((groupType != "GENERAL") || (groupType != "VIP") || (groupType != "VVIP")){
											System.out.println("Invalid input!! Please try again!");
											continue restart9;
										}
									}
									catch(Exception e){
										System.out.println("Invalid input!! Please try again!");
										continue restart9;
									}

									switch (groupType) {
										case "GENERAL":
											restart1:
											while (true) {
												System.out.print("\n==============================\n" +
														" 1. Minimum Spent Time\n" +
														" 2. Minimum Total Pay\n" +
														" 3. Back\n" +
														"==============================\n" +
														"Choose One: ");
												try{
													variable = Integer.parseInt(input.readLine());
													if((variable < 1) || (variable > 3)){
														System.out.println("Invalid input!! Please try again!");
														continue restart1;
													}
												}
												catch(Exception e){
													System.out.println("Invalid input!! Please try again!");
													continue restart1;
												}
												switch (variable) {
													case 1:
														System.out.print("Input Minimum Spent Time: ");
														try{
															general.minimumSpentTime = Integer.parseInt(input.readLine());
															if(general.minimumSpentTime < 0){
																System.out.println("Invalid input!! Please try again!");
																continue restart1;
															}
														}
														catch (Exception e){
															System.out.println("Invalid input!! Please try again!");
															continue restart1;
														}
														//general.minimumSpentTime = Integer.parseInt(input.readLine());
														continue restart1;
													case 2:
														System.out.print("Input Minimum Total Pay: ");
														try{
															general.minimumTotalPay= Integer.parseInt(input.readLine());
															if(general.minimumTotalPay < 0){
																System.out.println("Invalid input!! Please try again!");
																continue restart1;
															}
														}
														catch (Exception e){
															System.out.println("Invalid input!! Please try again!");
															continue restart1;
														}
														//general.minimumTotalPay = Integer.parseInt(input.readLine());
														continue restart1;
													case 3:
														break;
												}
												break;
											}
											continue restart9;
										case "VIP":
											restart2:
											while (true) {
												System.out.print("\n==============================\n" +
														" 1. Minimum Spent Time\n" +
														" 2. Minimum Total Pay\n" +
														" 3. Back\n" +
														"==============================\n" +
														"Choose One: ");

												try{
													variable = Integer.parseInt(input.readLine());
													if((variable < 1) || (variable > 3)){
														System.out.println("Invalid input!! Please try again!");
														continue restart2;
													}
												}
												catch(Exception e){
													System.out.println("Invalid input!! Please try again!");
													continue restart2;
												}

												switch (variable) {
													case 1:
														System.out.print("Input Minimum Spent Time: ");
														try{
															vip.minimumSpentTime = Integer.parseInt(input.readLine());
															if(vip.minimumSpentTime < 0){
																System.out.println("Invalid input!! Please try again!");
																continue restart2;
															}
														}
														catch (Exception e){
															System.out.println("Invalid input!! Please try again!");
															continue restart2;
														}
														//vip.minimumSpentTime = Integer.parseInt(input.readLine());
														continue restart2;
													case 2:
														System.out.print("Input Minimum Total Pay: ");
														try{
															vip.minimumTotalPay = Integer.parseInt(input.readLine());
															if(vip.minimumTotalPay < 0){
																System.out.println("Invalid input!! Please try again!");
																continue restart2;
															}
														}
														catch (Exception e){
															System.out.println("Invalid input!! Please try again!");
															continue restart2;
														}
														//vip.minimumTotalPay = Integer.parseInt(input.readLine());
														continue restart2;
													case 3:
														break;
												}
												break;
											}
											continue restart9;
										case "VVIP":
											restart3:
											while (true) {
												System.out.print("\n==============================\n" +
														" 1. Minimum Spent Time\n" +
														" 2. Minimum Total Pay\n" +
														" 3. Back\n" +
														"==============================\n" +
														"Choose One: ");

												try{
													variable = Integer.parseInt(input.readLine());
													if((variable < 1) || (variable > 3)){
														System.out.println("Invalid input!! Please try again!");
														continue restart3;
													}
												}
												catch(Exception e){
													System.out.println("Invalid input!! Please try again!");
													continue restart3;
												}
												switch (variable) {
													case 1:
														System.out.print("Input Minimum Spent Time: ");
														try{
															vvip.minimumSpentTime = Integer.parseInt(input.readLine());
															if(vvip.minimumSpentTime < 0){
																System.out.println("Invalid input!! Please try again!");
																continue restart3;
															}
														}
														catch (Exception e){
															System.out.println("Invalid input!! Please try again!");
															continue restart3;
														}
														//vvip.minimumSpentTime = Integer.parseInt(input.readLine());
														continue restart3;
													case 2:
														System.out.print("Input Minimum Total Pay: ");
														try{
															vvip.minimumTotalPay = Integer.parseInt(input.readLine());
															if(vvip.minimumTotalPay < 0){
																System.out.println("Invalid input!! Please try again!");
																continue restart3;
															}
														}
														catch (Exception e){
															System.out.println("Invalid input!! Please try again!");
															continue restart3;
														}
														//vvip.minimumTotalPay = Integer.parseInt(input.readLine());
														continue restart3;
													case 3:
														break;
												}
												break;
											}
											continue restart9;
										case "END":
											continue restart;
									}
									break;
								}break;
							case 2: //view parameter
								restart10:
								while(true) {
									System.out.print("\n** Press 'end', if you want to exit! **\n" +
											"Which group (GENERAL, VIP, VVIP)? ");

									try{
										groupType = input.readLine().toUpperCase();
										if((groupType != "GENERAL") || (groupType != "VIP") || (groupType != "VVIP")){
											System.out.println("Invalid input!! Please try again!");
											continue restart10;
										}
									}
									catch(Exception e){
										System.out.println("Invalid input!! Please try again!");
										continue restart10;
									}

									switch (groupType) {
										case "GENERAL":
											System.out.printf("GroupType: GENERAL\n" +
													"Parameter: Parameter{minimumSpentTime=%d, minimumTotalPay=%d}\n", general.minimumSpentTime, general.minimumTotalPay);
											continue restart10;
										case "VIP":
											System.out.printf("GroupType: VIP\n" +
													"Parameter: Parameter{minimumSpentTime=%d, minimumTotalPay=%d}\n", vip.minimumSpentTime, vip.minimumTotalPay);
											continue restart10;
										case "VVIP":
											System.out.printf("GroupType: VVIP\n" +
													"Parameter: Parameter{minimumSpentTime=%d, minimumTotalPay=%d}\n", vvip.minimumSpentTime, vvip.minimumTotalPay);
											continue restart10;
										case "END":
											continue restart;
									}
									break;
								}break;
							case 3: //update parameter
								restart11:
								while (true){
									System.out.print("** Press 'end', if you want to exit! **\n" +
											"Which group (GENERAL, VIP, VVIP)? ");
									try{
										groupType = input.readLine().toUpperCase();
										if((groupType != "GENERAL") || (groupType != "VIP") || (groupType != "VVIP")){
											System.out.println("Invalid input!! Please try again!");
											continue restart11;
										}
									}
									catch(Exception e){
										System.out.println("Invalid input!! Please try again!");
										continue restart11;
									}
									switch (groupType){
										case "GENERAL":
											System.out.printf("GroupType: GENERAL\n" +
													"Parameter: Parameter{minimumSpentTime=%d, minimumTotalPay=%d}\n", general.minimumSpentTime, general.minimumTotalPay);
											restart6:
											while(true) {
												System.out.print("\n==============================\n" +
														" 1. Minimum Spent Time\n" +
														" 2. Minimum Total Pay\n" +
														" 3. Back\n" +
														"==============================\n" +
														"Choose One: ");
												try{
													variable = Integer.parseInt(input.readLine());
													if((variable < 1) || (variable > 3)){
														System.out.println("Invalid input!! Please try again!");
														continue restart6;
													}
												}
												catch(Exception e){
													System.out.println("Invalid input!! Please try again!");
													continue restart6;
												}
												switch (variable) {
													case 1:
														System.out.print("Input Minimum Spent Time: ");
														try{
															general.minimumSpentTime = Integer.parseInt(input.readLine());
															if(general.minimumSpentTime < 0){
																System.out.println("Invalid input!! Please try again!");
																continue restart6;
															}
														}
														catch (Exception e){
															System.out.println("Invalid input!! Please try again!");
															continue restart6;
														}
														//general.minimumSpentTime = Integer.parseInt(input.readLine());
														continue restart6;
													case 2:
														System.out.print("Input Minimum Total Pay: ");
														try{
															general.minimumTotalPay = Integer.parseInt(input.readLine());
															if(general.minimumTotalPay < 0){
																System.out.println("Invalid input!! Please try again!");
																continue restart6;
															}
														}
														catch (Exception e){
															System.out.println("Invalid input!! Please try again!");
															continue restart6;
														}
														//general.minimumTotalPay = Integer.parseInt(input.readLine());
														continue restart6;
													case 3:
														continue restart11;
												}
												break;
											}break;

										case "VIP":
											System.out.printf("GroupType: VIP\n" +
													"Parameter: Parameter{minimumSpentTime=%d, minimumTotalPay=%d}\n", vip.minimumSpentTime, vip.minimumTotalPay);
											restart7:
											while(true) {
												System.out.print("\n==============================\n" +
														" 1. Minimum Spent Time\n" +
														" 2. Minimum Total Pay\n" +
														" 3. Back\n" +
														"==============================\n" +
														"Choose One: ");
												try{
													variable = Integer.parseInt(input.readLine());
													if((variable < 1) || (variable > 3)){
														System.out.println("Invalid input!! Please try again!");
														continue restart7;
													}
												}
												catch(Exception e){
													System.out.println("Invalid input!! Please try again!");
													continue restart7;
												}
												switch (variable) {
													case 1:
														System.out.print("Input Minimum Spent Time: ");
														try{
															vip.minimumSpentTime = Integer.parseInt(input.readLine());
															if(vip.minimumSpentTime < 0){
																System.out.println("Invalid input!! Please try again!");
																continue restart7;
															}
														}
														catch (Exception e){
															System.out.println("Invalid input!! Please try again!");
															continue restart7;
														}
														//vip.minimumSpentTime = Integer.parseInt(input.readLine());
														continue restart7;
													case 2:
														System.out.print("Input Minimum Total Pay: ");
														try{
															vip.minimumTotalPay = Integer.parseInt(input.readLine());
															if(vip.minimumTotalPay < 0){
																System.out.println("Invalid input!! Please try again!");
																continue restart7;
															}
														}
														catch (Exception e){
															System.out.println("Invalid input!! Please try again!");
															continue restart7;
														}
														//vip.minimumTotalPay = Integer.parseInt(input.readLine());
														continue restart7;
													case 3:
														continue restart11;
												}
												break;
											}break;
										case "VVIP":
											System.out.printf("GroupType: VVIP\n" +
													"Parameter: Parameter{minimumSpentTime=%d, minimumTotalPay=%d}\n", vvip.minimumSpentTime, vvip.minimumTotalPay);
											restart8:
											while(true) {
												System.out.print("\n==============================\n" +
														" 1. Minimum Spent Time\n" +
														" 2. Minimum Total Pay\n" +
														" 3. Back\n" +
														"==============================\n" +
														"Choose One: ");
												try{
													variable = Integer.parseInt(input.readLine());
													if((variable < 1) || (variable > 3)){
														System.out.println("Invalid input!! Please try again!");
														continue restart8;
													}
												}
												catch(Exception e){
													System.out.println("Invalid input!! Please try again!");
													continue restart8;
												}
												switch (variable) {
													case 1:
														System.out.print("Input Minimum Spent Time: ");
														try{
															vvip.minimumSpentTime = Integer.parseInt(input.readLine());
															if(vvip.minimumSpentTime < 0){
																System.out.println("Invalid input!! Please try again!");
																continue restart8;
															}
														}
														catch (Exception e){
															System.out.println("Invalid input!! Please try again!");
															continue restart8;
														}
														//vvip.minimumSpentTime = Integer.parseInt(input.readLine());
														continue restart8;
													case 2:
														System.out.print("Input Minimum Total Pay: ");
														try{
															vvip.minimumTotalPay = Integer.parseInt(input.readLine());
															if(vvip.minimumTotalPay < 0){
																System.out.println("Invalid input!! Please try again!");
																continue restart8;
															}
														}
														catch (Exception e){
															System.out.println("Invalid input!! Please try again!");
															continue restart8;
														}
														//vvip.minimumTotalPay = Integer.parseInt(input.readLine());
														continue restart8;
													case 3:
														continue restart11;
												}
												break;
											}break;
										case "END":
											continue restart;
									}
								}
							case 4: //back
								break;

						}
						break;
					}
					break;

				case 2://Customer Data
					restart4:
					while(true) {
						System.out.print("==============================\n" +
								" 1. Add Customer Data\n" +
								" 2. View Customer Data\n" +
								" 3. Update Customer Data\n" +
								" 4. Delete Customer Data\n" +
								" 5. Back\n" +
								"==============================\n" +
								"Choose One: ");
						try{
							variable = Integer.parseInt(input.readLine());
							if((variable < 1) || (variable > 5)){
								System.out.println("Invalid input!! Please try again!");
								continue restart4;
							}
						}
						catch(Exception e){
							System.out.println("Invalid input!! Please try again!");
							continue restart4;
						}
						switch (variable) {
							case 1://Add Customer
								System.out.print("** Press -1, if you want to exit! **\n" +
										"How many customers to input? ");
								int newCustomerNum = 0;
								try{
									newCustomerNum = Integer.parseInt(input.readLine());
								}
								catch (Exception e){
									System.out.println("Invalid input!! Please try again!");
									continue restart4;
								}

								if (newCustomerNum == -1) continue restart4;
								else if (newCustomerNum + (findPosition(customer) + 1) >= customer.length) {
									customer = stretchArray(customer);
								}

								for(int a = 0; a < newCustomerNum; a++) {
									System.out.printf("====== Customer %d Info. ======\n", findPosition(customer) + 2);
									currentPosition = findPosition(customer) + 1;
									beNew(temp);
									temp1 = findPosition(customer) + 2;
									temp.customerNo = temp1;
									temp.serialNo = num++;

									restart5:
									while (true) {
										System.out.print("\n" +
												"==============================\n" +
												" 1. Customer Name\n" +
												" 2. Customer ID\n" +
												" 3. Customer Spent Time\n" +
												" 4. Customer Total Pay\n" +
												" 5. Back\n" +
												"==============================\n" +
												"Choose One: ");
										try{
											variable = Integer.parseInt(input.readLine());
											if((variable < 1) || (variable > 5)){
												System.out.println("Invalid input!! Please try again!");
												continue restart5;
											}
										}
										catch(Exception e){
											System.out.println("Invalid input!! Please try again!");
											continue restart5;
										}
										restart17:
										while(true) {
											switch (variable) {
												case 1:
													System.out.println("Input Customer's Name: ");
													try {
														temp.customerName = input.readLine();
														if (!(temp.customerName.matches("^([a-zA-Z]{3,})$"))) {
															System.out.println("Invalid input!! Please try again!");
															continue restart17;
														}
													} catch (Exception e) {
														System.out.println("Invalid input!! Please try again!");
														continue restart17;
													}
													customer[currentPosition] = (Customer) temp.clone();
													continue restart5;
												case 2:
													System.out.println("Input Customer's UserID: ");
													try {
														temp.customerID = input.readLine();
														if (!(temp.customerID.matches("^([a-zA-Z][a-zA-Z0-9_]{5,12})$"))) {
															System.out.println("Invalid input!! Please try again!");
															continue restart17;
														}
													} catch (Exception e) {
														System.out.println("Invalid input!! Please try again!");
														continue restart17;
													}
													customer[currentPosition] = (Customer) temp.clone();
													continue restart5;
												case 3:
													System.out.println("Input Customer's Spent Time at Your Store: ");
													try{
														temp.time = Integer.parseInt(input.readLine());
														if(temp.time < 0){
															System.out.println("Invalid input!! Please try again!");
															continue restart17;
														}
													}
													catch(Exception e){
														System.out.println("Invalid input!! Please try again!");
														continue restart17;
													}
													customer[currentPosition] = (Customer) temp.clone();
													continue restart5;
												case 4:
													System.out.println("Input Customer's Total Payment at Your Store: ");
													try{
														temp.spend = Integer.parseInt(input.readLine());
														if(temp.spend < 0){
															System.out.println("Invalid input!! Please try again!");
															continue restart17;
														}
													}
													catch(Exception e){
														System.out.println("Invalid input!! Please try again!");
														continue restart17;
													}
													customer[currentPosition] = (Customer) temp.clone();
													continue restart5;
												case 5:
													break;
											}
											break;
										}break;
									}
								} continue restart4;

							case 2://View Customer
								System.out.print("\n======= Customer Info. =======\n");
								for (int a = 0; a < findPosition(customer) + 1; a++) {
									customer[a].showCustomerInfo();
								}
								continue restart4;

							case 3://Update Customer
								System.out.print("\n======= Customer Info. =======\n");
								for (int a = 0; a < findPosition(customer) + 1; a++) {
									customer[a].showCustomerInfo();
								}
								restart18:
								while(true) {
									System.out.printf("Which customer ( 1 ~ %d )? ", findPosition(customer) + 1);
									try{
										variable = Integer.parseInt(input.readLine());
										if((variable < 1) || (variable > findPosition(customer) + 1)){
											System.out.println("Invalid input!! Please try again!");
											continue restart18;
										}
									}
									catch (Exception e){
										System.out.println("Invalid input!! Please try again!");
										continue restart18;
									}
									break;
								}
								restart19:
								while(true) {
									System.out.print("\n==============================\n" +
											" 1. Customer Name\n" +
											" 2. Customer ID\n" +
											" 3. Customer Spent Time\n" +
											" 4. Customer Total Pay\n" +
											" 5. Back\n" +
											"==============================\n" +
											"Choose One: ");
									try {
										variable = Integer.parseInt(input.readLine());
										if ((variable < 1) || (variable > 5)) {
											System.out.println("Invalid input!! Please try again!");
											continue restart19;
										}
									} catch (Exception e) {
										System.out.println("Invalid input!! Please try again!");
										continue restart19;
									}
									break;
								}
								restart20:
								while(true) {
									switch (variable) {
										case 1:
											System.out.print("Input Customer's Name: ");
											try {
												customer[variable - 1].customerName = input.readLine();
												if (!(customer[variable - 1].customerName.matches("^([a-zA-Z]{3,})$"))) {
													System.out.println("Invalid input!! Please try again!");
													continue restart20;
												}
											} catch (Exception e) {
												System.out.println("Invalid input!! Please try again!");
												continue restart20;
											}
											break;
										case 2:
											System.out.print("Input Customer's UserID: ");
											try {
												customer[variable - 1].customerID = input.readLine();
												if (!(customer[variable - 1].customerID.matches("^([a-zA-Z][a-zA-Z0-9_]{5,12})$"))) {
													System.out.println("Invalid input!! Please try again!");
													continue restart20;
												}
											} catch (Exception e) {
												System.out.println("Invalid input!! Please try again!");
												continue restart20;
											}
											break;
										case 3:
											System.out.print("Input Customer's Spent Time at Your Store: ");
											try{
												customer[variable - 1].time = Integer.parseInt(input.readLine());
												if(customer[variable - 1].time < 0){
													System.out.println("Invalid input!! Please try again!");
													continue restart20;
												}
											}
											catch(Exception e){
												System.out.println("Invalid input!! Please try again!");
												continue restart20;
											}
											break;
										case 4:
											System.out.print("Input Customer's Total Payment at Your Store: ");
											try{
												customer[variable - 1].spend = Integer.parseInt(input.readLine());
												if(customer[variable - 1].spend < 0){
													System.out.println("Invalid input!! Please try again!");
													continue restart20;
												}
											}
											catch(Exception e){
												System.out.println("Invalid input!! Please try again!");
												continue restart20;
											}
											break;
										case 5:
											continue restart4;
									}break;
								}
								continue restart4;

							case 4://Delete Customer
								System.out.println("======= Customer Info. =======");
								for (int a = 0; a < findPosition(customer) + 1; a++) {
									customer[a].showCustomerInfo();
								}

								restart21:
								while(true) {
									System.out.printf("Which customer ( 1 ~ %d )? ", findPosition(customer) + 1);
									try{
										variable = Integer.parseInt(input.readLine());
										if((variable < 1) || (variable > findPosition(customer) + 1)){
											System.out.println("Invalid input!! Please try again!");
											continue restart21;
										}
									}
									catch(Exception e){
										System.out.println("Invalid input!! Please try again!");
										continue restart21;
									}
									break;
								}
								System.out.println("Customer Data Deleted Successfully!!");
								for (int a = variable - 1; a < findPosition(customer) + 1; a++) {
									if(customer[a + 1] == null){
										customer[a] = null;
									}
									customer[a] = customer[a + 1];
									if(customer[a] != null) customer[a].customerNo -= 1;
								}
								System.out.println("======= Customer Info. =======");
								for (int a = 0; a < findPosition(customer) + 1; a++) {
									customer[a].showCustomerInfo();
								}
								continue restart4;
							case 5:
								break;
						}
						break;
					}break;
				case 3://summary
					for(int a = 0; a < findPosition(customer) + 1; a++){
						int t = 0;
						if((customer[a].time < general.minimumSpentTime) && (customer[a].spend < general.minimumTotalPay)){
							t = findPosition(others) + 1;
							others[t] = (Customer) customer[a].clone();
						}
						else if(((customer[a].time < vip.minimumSpentTime) && (customer[a].time >= general.minimumSpentTime)) &&
								((customer[a].spend < vip.minimumTotalPay) && (customer[a].spend >= general.minimumTotalPay))){
							t = findPosition(gen) + 1;
							gen[t] = (Customer) customer[a].clone();
						}
						else if(((customer[a].time < vvip.minimumSpentTime) && (customer[a].time >= vip.minimumSpentTime)) &&
								((customer[a].spend < vvip.minimumTotalPay) && (customer[a].spend >= vip.minimumTotalPay))){
							t = findPosition(v) + 1;
							v[t] = (Customer) customer[a].clone();
						}
						else if((customer[a].time >= vvip.minimumSpentTime) && (customer[a].spend >= vvip.minimumTotalPay)){
							t = findPosition(vv) + 1;
							vv[t] = (Customer) customer[a].clone();
						}
					}
					restart13:
					while(true) {
						System.out.print("==============================\n" +
								" 1. Summary\n" +
								" 2. Summary (Sorted By Name)\n" +
								" 3. Summary (Sorted By Spent Time)\n" +
								" 4. Summary (Sorted By Total Payment)\n" +
								" 5. Back\n" +
								"==============================\n" +
								"Choose One: ");
						try {
							variable = Integer.parseInt(input.readLine());
							if ((variable < 1) || (variable > 5)) {
								System.out.println("Invalid input!! Please try again!");
								continue restart13;
							}
						} catch (Exception e) {
							System.out.println("Invalid input!! Please try again!");
							continue restart13;
						}

						switch (variable) {
							case 1://Summary
								System.out.printf("\n" +
										"==============================\n" +
										"Others : %d customer(s)\n" +
										"------------------------------\n", findPosition(others) + 1);
								for (int a = 0; a < findPosition(others) + 1; a++) {
									if (others[0] == null) {
										System.out.print("No customer.\n");
										break;
									}
									others[a].showCustomerInfo();
								}
								System.out.printf("\n" +
										"==============================\n" +
										"GENERAL Group : %d customer(s)\n", findPosition(gen) + 1);
								if (general.minimumSpentTime == 0 && general.minimumTotalPay == 0) {
									System.out.print("[Parameter] null\n");
								}
								System.out.printf("[Parameter] Parameter {%s : %d , %s : %d} \n", "minimumSpentTime", general.minimumSpentTime, "minimumTotalPay", general.minimumTotalPay);
								System.out.print("------------------------------\n");

								for (int a = 0; a < findPosition(gen) + 1; a++) {
									if (gen[0] == null) {
										System.out.print("No customer.\n");
										break;
									}
									gen[a].showCustomerInfo();
								}
								System.out.printf("\n" +
										"==============================\n" +
										"VIP Group : %d customer(s)\n", findPosition(v) + 1);
								if (vip.minimumSpentTime == 0 && vip.minimumTotalPay == 0) {
									System.out.print("[Parameter] null\n");
								}
								System.out.printf("[Parameter] Parameter {%s : %d , %s : %d} \n", "minimumSpentTime", vip.minimumSpentTime, "minimumTotalPay", vip.minimumTotalPay);
								System.out.print("------------------------------\n");

								for (int a = 0; a < findPosition(v) + 1; a++) {
									if (v[0] == null) {
										System.out.print("No customer.\n");
										break;
									}
									v[a].showCustomerInfo();
								}
								System.out.printf("\n" +
										"==============================\n" +
										"VVIP Group : %d customer(s)\n", findPosition(vv) + 1);
								if (vvip.minimumSpentTime == 0 && vvip.minimumTotalPay == 0) {
									System.out.print("[Parameter] null\n");
								}
								System.out.printf("[Parameter] Parameter {%s : %d , %s : %d} \n", "minimumSpentTime", vvip.minimumSpentTime, "minimumTotalPay", vvip.minimumTotalPay);
								System.out.print("------------------------------\n");

								for (int a = 0; a < findPosition(vv) + 1; a++) {
									if (vv[0] == null) {
										System.out.print("No customer.\n");
										break;
									}
									vv[a].showCustomerInfo();
								}
								continue restart13;
							case 2://Sorted By Name
								restart12:
								while (true) {
									System.out.print("** Press 'end', if you want to exit! **\n" +
											"Which order (ASCENDING, DESCENDING)? ");
									try {
										groupType = input.readLine().toUpperCase();
										if ((groupType.equals("ASCENDING")) && (groupType.equals("DESCENDING")) && (groupType.equals("END"))) {
											System.out.println("Invalid input!! Please try again!");
											continue restart12;
										}
									} catch (Exception e) {
										System.out.println("Invalid input!! Please try again!");
										continue restart12;
									}
									switch (groupType) {
										case "ASCENDING":
											ascending(others, 2);
											ascending(gen, 2);
											ascending(v, 2);
											ascending(vv, 2);
											showSummary(others, gen, v, vv, general, vip, vvip);
											continue restart12;
										case "DESCENDING":
											descending(others, 2);
											descending(gen, 2);
											descending(v, 2);
											descending(vv, 2);
											showSummary(others, gen, v, vv, general, vip, vvip);
											continue restart12;
										case "END":
											continue restart13;
									}
									break;
								}break;

							case 3://Sorted By Spent Time
								restart14:
								while(true) {
									System.out.print("** Press 'end', if you want to exit! **\n" +
											"Which order (ASCENDING, DESCENDING)? ");
									try{
										groupType = input.readLine().toUpperCase();
										if((groupType.equals("ASCENDING")) && (groupType.equals("DESCENDING")) && (groupType.equals("END"))){
											System.out.println("Invalid input!! Please try again!");
											continue restart14;
										}
									} catch (Exception e) {
										System.out.println("Invalid input!! Please try again!");
										continue restart14;
									}
									switch (groupType) {
										case "ASCENDING":
											ascending(others, 3);
											ascending(gen, 3);
											ascending(v, 3);
											ascending(vv, 3);
											showSummary(others, gen, v, vv, general, vip, vvip);
											continue restart14;
										case "DESCENDING":
											descending(others, 3);
											descending(gen, 3);
											descending(v, 3);
											descending(vv, 3);
											showSummary(others, gen, v, vv, general, vip, vvip);
											continue restart14;
										case "END":
											continue restart13;
									}break;
								}break;

							case 4://Sorted By Total Payment
								restart15:
								while(true) {
									System.out.print("** Press 'end', if you want to exit! **\n" +
											"Which order (ASCENDING, DESCENDING)? ");
									try{
										groupType = input.readLine().toUpperCase();
										if((groupType.equals("ASCENDING")) && (groupType.equals("DESCENDING")) && (groupType.equals("END"))){
											System.out.println("Invalid input!! Please try again!");
											continue restart15;
										}
									} catch (Exception e) {
										System.out.println("Invalid input!! Please try again!");
										continue restart15;
									}
									switch (groupType) {
										case "ASCENDING":
											ascending(others, 4);
											ascending(gen, 4);
											ascending(v, 4);
											ascending(vv, 4);
											showSummary(others, gen, v, vv, general, vip, vvip);
											continue restart15;
										case "DESCENDING":
											descending(others, 4);
											descending(gen, 4);
											descending(v, 4);
											descending(vv, 4);
											showSummary(others, gen, v, vv, general, vip, vvip);
											continue restart15;
										case "END":
											continue restart13;
									}break;
								}break;

							case 5:
								continue restart16;
						}
						break;
					}
				case 4:
					return;
			}
		}

	}

	/////////////////////////////////////아래는 필요한 메서드들////////////////////////////

	//공간이 부족할 경우 배열의 크기를 늘려주는 메서드
	public static Customer[] stretchArray (Customer[]customer){
		Customer[] temp = new Customer[customer.length * 2];
		for (int i = 0; i < customer.length; i++) {
			temp[i] = customer[i];
		}
		customer = temp;
		return customer;
	}

	//Customer 객체를 초기화 해주는 메서드
	public static Customer beNew(Customer temp){
		temp.customerNo = 0;
		temp.serialNo = 0;
		temp.time = 0;
		temp.spend = 0;
		temp.customerName = null;
		temp.customerID = null;
		return temp;
	}

	//분류된 General, Vip, VVip 객체들을 출력해주는 메서드
	public static void showSummary(Customer[] others, Customer[] gen, Customer[] v, Customer[] vv, Level general, Level vip, Level vvip){
		System.out.printf("\n" +
				"==============================\n" +
				"Others : %d customer(s)\n" +
				"------------------------------\n", findPosition(others) + 1);
		for(int a = 0; a < findPosition(others) + 1; a++){
			if(others[0] == null) {
				System.out.print("No customer.\n");
				break;
			}
			others[a].showCustomerInfo();
		}
		System.out.printf("\n"+
				"==============================\n" +
				"GENERAL Group : %d customer(s)\n", findPosition(gen) + 1);
		if(general.minimumSpentTime == 0 && general.minimumTotalPay == 0){
			System.out.print("[Parameter] null\n");
		}
		System.out.printf("[Parameter] Parameter {%s : %d , %s : %d} \n", "minimumSpentTime", general.minimumSpentTime, "minimumTotalPay", general.minimumTotalPay);
		System.out.print("------------------------------\n");

		for(int a = 0; a < findPosition(gen) + 1; a++){
			if(gen[0] == null){
				System.out.print("No customer.\n");
				break;
			}
			gen[a].showCustomerInfo();
		}
		System.out.printf("\n" +
				"==============================\n" +
				"VIP Group : %d customer(s)\n", findPosition(v) + 1);
		if(vip.minimumSpentTime == 0 && vip.minimumTotalPay == 0){
			System.out.print("[Parameter] null\n");
		}
		System.out.printf("[Parameter] Parameter {%s : %d , %s : %d} \n", "minimumSpentTime", vip.minimumSpentTime, "minimumTotalPay", vip.minimumTotalPay);
		System.out.print("------------------------------\n");

		for(int a = 0; a < findPosition(v) + 1; a++){
			if(v[0] == null){
				System.out.print("No customer.\n");
				break;
			}
			v[a].showCustomerInfo();
		}
		System.out.printf("\n" +
				"==============================\n" +
				"VVIP Group : %d customer(s)\n", findPosition(vv) + 1);
		if(vvip.minimumSpentTime == 0 && vvip.minimumTotalPay == 0){
			System.out.print("[Parameter] null\n");
		}
		System.out.printf("[Parameter] Parameter {%s : %d , %s : %d} \n", "minimumSpentTime", vvip.minimumSpentTime, "minimumTotalPay", vvip.minimumTotalPay);
		System.out.print("------------------------------\n");

		for(int a = 0; a < findPosition(vv) + 1; a++){
			if(vv[0] == null){
				System.out.print("No customer.\n");
				break;
			}
			vv[a].showCustomerInfo();
		}
	}

	//배열의 마지막 인덱스를 반환해주는 메서드
	public static int findPosition(Customer[] customer){
		int position = -1;

		for(int i = 0; i < customer.length; i++){
			if(customer[i] != null) {
				position = i;
			}
		}
		return position;
	}

	//Customer 배열을 특정 값 기준으로 오름차순으로 정렬해주는 메서드
	public static Customer[] ascending(Customer[] customer, int caseNum){

		Customer moment;
		int temp = 0; //배열에서 정보가 들어있는 마지막 칸을 알려줌
		//    for(int i = 0; i < customer.length; i++){
		//        if(customer[i].serialNo != null) temp = i;
		//    }

		temp = findPosition(customer) + 1;

		switch(caseNum){
			case 2: //이름 기준으로 오름차순 정렬
				for(int a = 0; a < temp; a++){
					for(int b = 0; b < temp-1-a; b++){
						if(customer[b].customerName.compareToIgnoreCase(customer[b+1].customerName) > 0) {
							moment = customer[b];
							customer[b] = customer[b + 1];
							customer[b + 1] = moment;
						}
					}
				}
				break;
			case 3: //시간 기준으로 오름차순 정렬
				for(int a = 0; a < temp; a++){
					for(int b = 0; b < temp-1-a; b++){
						if(customer[b].time > customer[b+1].time) {
							moment = customer[b];
							customer[b] = customer[b + 1];
							customer[b + 1] = moment;
						}
					}
				}
				break;
			case 4: //금액 기준으로 오름차순 정렬
				for(int a = 0; a < temp; a++){
					for(int b = 0; b < temp-1-a; b++){
						if(customer[b].spend > customer[b+1].spend) {
							moment = customer[b];
							customer[b] = customer[b + 1];
							customer[b + 1] = moment;
						}
					}
				}
				break;
		}

		return customer;
	}

	//Customer 배열을 특정값 기준으로 내림차순 정렬해주는 메서드
	public static Customer[] descending(Customer[] customer, int caseNum){
		Customer moment;
		int temp = 0; //배열에서 정보가 들어있는 마지막 칸을 알려줌
		//    for(int i = 0; i < customer.length; i++){
		//       if(customer[i].serialNo != null) temp = i;
		//    }

		temp = findPosition(customer) + 1;

		switch(caseNum){
			case 2: //이름 기준으로 오름차순 정렬
				for(int a = 0; a < temp; a++){
					for(int b = 0; b < temp-1-a; b++){
						if(customer[b].customerName.compareToIgnoreCase(customer[b+1].customerName) < 0) {
							moment = customer[b];
							customer[b] = customer[b + 1];
							customer[b + 1] = moment;
						}
					}
				}
				break;
			case 3: //시간 기준으로 오름차순 정렬
				for(int a = 0; a < temp; a++){
					for(int b = 0; b < temp-1-a; b++){
						if(customer[b].time < customer[b+1].time) {
							moment = customer[b];
							customer[b] = customer[b + 1];
							customer[b + 1] = moment;
						}
					}
				}
				break;
			case 4: //금액 기준으로 오름차순 정렬
				for(int a = 0; a < temp; a++){
					for(int b = 0; b < temp-1-a; b++){
						if(customer[b].spend < customer[b+1].spend) {
							moment = customer[b];
							customer[b] = customer[b + 1];
							customer[b + 1] = moment;
						}
					}
				}
				break;
		}

		return customer;
	}
}
