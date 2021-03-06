/**
*
* Copyright � Kaustuv Maji , 2014
* Repos - https://github.com/kaustuvmaji
* Blog -  http://kaustuvmaji.blogspot.in
*
*/
package ldap.advance.example;

import java.util.List;

/**
 * <pre>
 * This interface is used for
 * 	 a) fetch all the user details as a list of String
 *   b) fetch all the user details as a list of User object
 *   c) fetch user details of particular user.
 * </pre>
 *
 * @author KMaji
 *
 */
public interface UserRepositoryIntf {

	/**
	 * This method is responsible to fetch all the user details as a list of
	 * String.
	 *
	 * @return list of String.
	 */
	public List<String> getAllUserNames();

	/**
	 * This method is responsible to fetch all the user details as a list of
	 * User object
	 *
	 * @return list of {@link User}
	 */
	public List<User> getAllUsers();

	/**
	 * This method is responsible to fetch user details of particular user.
	 *
	 * @return user details {@link User}
	 */
	public User getUserDetails(String userName);

	/**
	 * This method is responsible to fetch user details of particular user as a string.
	 *
	 * @return user detail {@link User}
	 */
	public String getUserDetail(String userName);

	/**
	 * This method is responsible to authenticate user.
	 *
	 * @return boolean true|false
	 */
	public boolean authenticate(String base,String userName, String password);

	/**
	 * This method is responsible to update telephone number of user.
	 *
	 * @return boolean true|false
	 */
	public User updateTelePhone(String userName, String newNumber);

	/**
	 * This method is responsible to create user.
	 */
	public boolean createUser(User user);

	/**
	 * This method is responsible to delete user.
	 */
	public boolean remove(String uid);
}
