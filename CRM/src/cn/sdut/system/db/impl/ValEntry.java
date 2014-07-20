package cn.sdut.system.db.impl;

import org.apache.struts2.util.ListEntry;

public class ValEntry extends ListEntry {

	public ValEntry(Object key, Object val) {
		super(key, val, false);
	}

	@Override
	public String toString() {
		StringBuilder tem = new StringBuilder().append(this.getClass() + "@[")
				.append("key=" + this.getKey())
				.append(",value=" + this.getValue()).append("]");
		return tem.toString();
	}

}
