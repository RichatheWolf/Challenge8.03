public class Person {
		private String name, relation, phone, email;
		
		private String birthday;
		
		/**
		 * @param name
		 * @param relation
		 * @param phone
		 * @param email
		 * @param birthday
		 */
		public Person(String name, String relation, String phone, String email, String birthday) {
			this.name = name;
			this.relation = relation;
			this.phone = phone;
			this.email = email;
			this.birthday = birthday;
		}
		
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		
		/**
		 * @return the relation
		 */
		public String getRelation() {
			return relation;
		}
		
		/**
		 * @return the phone
		 */
		public String getPhone() {
			return phone;
		}
		
		/**
		 * @return the email
		 */
		public String getEmail() {
			return email;
		}
		
		/**
		 * @return the birthday
		 */
		public String getBirthday() {
			return birthday;
		}
		
		@Override
		public String toString() {
			return String.format("%-20s%-15s%-15s%-40s%-20s", name, relation, phone,
					email,  birthday);
		}
		
}
