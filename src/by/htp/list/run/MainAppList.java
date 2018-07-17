package by.htp.list.run;

import by.htp.list.entity.LinkList;

public class MainAppList {

	public static void main(String[] args) {
		
		LinkList list = new LinkList();
		
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		
		list.displayNodes();

	}

}
