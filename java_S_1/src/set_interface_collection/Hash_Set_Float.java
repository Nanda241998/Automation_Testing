package set_interface_collection;

import java.util.HashSet;

public class Hash_Set_Float {

	public static void main(String[] args) {
		HashSet<Float> decimal_num= new HashSet<Float>();
		decimal_num.add(12.3f);
		decimal_num.add(12.3f);
		decimal_num.add(42.3f);
		decimal_num.add(56.3f);
		decimal_num.add(42.6f);
		decimal_num.add(67.7f);
		decimal_num.add(34.3f);
		decimal_num.add(10.3f);

		System.out.println(decimal_num);
		System.out.println(decimal_num.clone());
		System.out.println(decimal_num.isEmpty());
		System.out.println(decimal_num.contains(10.3f));
		System.out.println(decimal_num.size());
		System.out.println(decimal_num.remove(10.3f));
		System.out.println(decimal_num);
	}

}
