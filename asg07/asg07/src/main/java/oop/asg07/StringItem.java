/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.asg07;

/**
 *
 * @author Luong
 */
public class StringItem implements Item {

	private String value;
	public StringItem(String _value)
	{
		value = _value;
	}

   
        @Override
	public Item clone()
	{
		return new StringItem(value);
	}
        @Override
	public String toString()
	{
		return value;
	}
	public boolean equals(Item otherItem)
	{
		return this.toString().equals(otherItem.toString());
	}
}
