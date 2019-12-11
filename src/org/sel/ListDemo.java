package org.sel;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Encaps e1 = new Encaps();
e1.setId(123);
e1.setName("uv");
e1.setPhone(1234567890l);
Encaps e2 = new Encaps();
e2.setId(456);
e2.setName("alex");
e2.setPhone(987543721l);
Encaps e3 = new Encaps();
e3.setId(789);
e3.setName("karthi");
e3.setPhone(8798475l);


List <Encaps> li = new ArrayList();
li.add(e1);
li.add(e2);
li.add(e3);

for (int i = 0; i < li.size(); i++) {
	System.out.println(li.get(i).getName());
	System.out.println(li.get(i).getId());
	
	long phone = li.get(i).getPhone();
	System.out.println(phone);
}
}
	
}

	

