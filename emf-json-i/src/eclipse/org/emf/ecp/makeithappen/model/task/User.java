/**
 */
package eclipse.org.emf.ecp.makeithappen.model.task;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getTasks <em>Tasks</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getFirstName <em>First Name</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getLastName <em>Last Name</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getGender <em>Gender</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.User#isActive <em>Active</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getTimeOfRegistration <em>Time Of Registration</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getWeight <em>Weight</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getHeigth <em>Heigth</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getNationality <em>Nationality</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getDateOfBirth <em>Date Of Birth</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getEmail <em>Email</em>}</li>
 * </ul>
 *
 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage#getUser()
 * @model extendedMetaData="name='User' kind='elementOnly'"
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link eclipse.org.emf.ecp.makeithappen.model.task.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage#getUser_Tasks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tasks'"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage#getUser_FirstName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='firstName'"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage#getUser_LastName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='lastName'"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * The literals are from the enumeration {@link eclipse.org.emf.ecp.makeithappen.model.task.Gender}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gender</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.Gender
	 * @see #isSetGender()
	 * @see #unsetGender()
	 * @see #setGender(Gender)
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage#getUser_Gender()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='gender'"
	 * @generated
	 */
	Gender getGender();

	/**
	 * Sets the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.Gender
	 * @see #isSetGender()
	 * @see #unsetGender()
	 * @see #getGender()
	 * @generated
	 */
	void setGender(Gender value);

	/**
	 * Unsets the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGender()
	 * @see #getGender()
	 * @see #setGender(Gender)
	 * @generated
	 */
	void unsetGender();

	/**
	 * Returns whether the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getGender <em>Gender</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gender</em>' attribute is set.
	 * @see #unsetGender()
	 * @see #getGender()
	 * @see #setGender(Gender)
	 * @generated
	 */
	boolean isSetGender();

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #isSetActive()
	 * @see #unsetActive()
	 * @see #setActive(boolean)
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage#getUser_Active()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='active'"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isSetActive()
	 * @see #unsetActive()
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Unsets the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActive()
	 * @see #isActive()
	 * @see #setActive(boolean)
	 * @generated
	 */
	void unsetActive();

	/**
	 * Returns whether the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#isActive <em>Active</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Active</em>' attribute is set.
	 * @see #unsetActive()
	 * @see #isActive()
	 * @see #setActive(boolean)
	 * @generated
	 */
	boolean isSetActive();

	/**
	 * Returns the value of the '<em><b>Time Of Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Of Registration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Of Registration</em>' attribute.
	 * @see #setTimeOfRegistration(XMLGregorianCalendar)
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage#getUser_TimeOfRegistration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='timeOfRegistration'"
	 * @generated
	 */
	XMLGregorianCalendar getTimeOfRegistration();

	/**
	 * Sets the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getTimeOfRegistration <em>Time Of Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Of Registration</em>' attribute.
	 * @see #getTimeOfRegistration()
	 * @generated
	 */
	void setTimeOfRegistration(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #isSetWeight()
	 * @see #unsetWeight()
	 * @see #setWeight(double)
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage#getUser_Weight()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='weight'"
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #isSetWeight()
	 * @see #unsetWeight()
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Unsets the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWeight()
	 * @see #getWeight()
	 * @see #setWeight(double)
	 * @generated
	 */
	void unsetWeight();

	/**
	 * Returns whether the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getWeight <em>Weight</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Weight</em>' attribute is set.
	 * @see #unsetWeight()
	 * @see #getWeight()
	 * @see #setWeight(double)
	 * @generated
	 */
	boolean isSetWeight();

	/**
	 * Returns the value of the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heigth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heigth</em>' attribute.
	 * @see #isSetHeigth()
	 * @see #unsetHeigth()
	 * @see #setHeigth(int)
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage#getUser_Heigth()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='heigth'"
	 * @generated
	 */
	int getHeigth();

	/**
	 * Sets the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getHeigth <em>Heigth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heigth</em>' attribute.
	 * @see #isSetHeigth()
	 * @see #unsetHeigth()
	 * @see #getHeigth()
	 * @generated
	 */
	void setHeigth(int value);

	/**
	 * Unsets the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getHeigth <em>Heigth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHeigth()
	 * @see #getHeigth()
	 * @see #setHeigth(int)
	 * @generated
	 */
	void unsetHeigth();

	/**
	 * Returns whether the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getHeigth <em>Heigth</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Heigth</em>' attribute is set.
	 * @see #unsetHeigth()
	 * @see #getHeigth()
	 * @see #setHeigth(int)
	 * @generated
	 */
	boolean isSetHeigth();

	/**
	 * Returns the value of the '<em><b>Nationality</b></em>' attribute.
	 * The literals are from the enumeration {@link eclipse.org.emf.ecp.makeithappen.model.task.Nationality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nationality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nationality</em>' attribute.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.Nationality
	 * @see #isSetNationality()
	 * @see #unsetNationality()
	 * @see #setNationality(Nationality)
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage#getUser_Nationality()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='nationality'"
	 * @generated
	 */
	Nationality getNationality();

	/**
	 * Sets the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getNationality <em>Nationality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nationality</em>' attribute.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.Nationality
	 * @see #isSetNationality()
	 * @see #unsetNationality()
	 * @see #getNationality()
	 * @generated
	 */
	void setNationality(Nationality value);

	/**
	 * Unsets the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getNationality <em>Nationality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNationality()
	 * @see #getNationality()
	 * @see #setNationality(Nationality)
	 * @generated
	 */
	void unsetNationality();

	/**
	 * Returns whether the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getNationality <em>Nationality</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nationality</em>' attribute is set.
	 * @see #unsetNationality()
	 * @see #getNationality()
	 * @see #setNationality(Nationality)
	 * @generated
	 */
	boolean isSetNationality();

	/**
	 * Returns the value of the '<em><b>Date Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Of Birth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Birth</em>' attribute.
	 * @see #setDateOfBirth(XMLGregorianCalendar)
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage#getUser_DateOfBirth()
	 * @model dataType="eclipse.org.emf.ecp.makeithappen.model.task.DateOfBirth"
	 *        extendedMetaData="kind='attribute' name='dateOfBirth'"
	 * @generated
	 */
	XMLGregorianCalendar getDateOfBirth();

	/**
	 * Sets the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getDateOfBirth <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Birth</em>' attribute.
	 * @see #getDateOfBirth()
	 * @generated
	 */
	void setDateOfBirth(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage#getUser_Email()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='email'"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

} // User
