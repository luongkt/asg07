/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.asg07;


/**
 *
 * @author Luong
 */
public class NumeralItem  implements Item {
    private int value;
	public NumeralItem(int _value)
	{
		value = _value;
	}

    @Override
	public Item clone()
	{
		return new NumeralItem(value);
	}
    @Override
	public String toString()
	{
		return Integer.toString(value);
	}
	public boolean equals(Item otherItem)
	{
		return this.toString().equals(otherItem.toString());
	}

    }

