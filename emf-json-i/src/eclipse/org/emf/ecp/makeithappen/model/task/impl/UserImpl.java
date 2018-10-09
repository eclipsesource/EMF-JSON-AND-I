/**
 */
package eclipse.org.emf.ecp.makeithappen.model.task.impl;

import eclipse.org.emf.ecp.makeithappen.model.task.Gender;
import eclipse.org.emf.ecp.makeithappen.model.task.Nationality;
import eclipse.org.emf.ecp.makeithappen.model.task.Task;
import eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage;
import eclipse.org.emf.ecp.makeithappen.model.task.User;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.UserImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.UserImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.UserImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.UserImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.UserImpl#isActive <em>Active</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.UserImpl#getTimeOfRegistration <em>Time Of Registration</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.UserImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.UserImpl#getHeigth <em>Heigth</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.UserImpl#getNationality <em>Nationality</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.UserImpl#getDateOfBirth <em>Date Of Birth</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.UserImpl#getEmail <em>Email</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends MinimalEObjectImpl.Container implements User {
	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final Gender GENDER_EDEFAULT = Gender.MALE;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected Gender gender = GENDER_EDEFAULT;

	/**
	 * This is true if the Gender attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean genderESet;

	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * This is true if the Active attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean activeESet;

	/**
	 * The default value of the '{@link #getTimeOfRegistration() <em>Time Of Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfRegistration()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TIME_OF_REGISTRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeOfRegistration() <em>Time Of Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfRegistration()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar timeOfRegistration = TIME_OF_REGISTRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected double weight = WEIGHT_EDEFAULT;

	/**
	 * This is true if the Weight attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean weightESet;

	/**
	 * The default value of the '{@link #getHeigth() <em>Heigth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeigth()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeigth() <em>Heigth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeigth()
	 * @generated
	 * @ordered
	 */
	protected int heigth = HEIGTH_EDEFAULT;

	/**
	 * This is true if the Heigth attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean heigthESet;

	/**
	 * The default value of the '{@link #getNationality() <em>Nationality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNationality()
	 * @generated
	 * @ordered
	 */
	protected static final Nationality NATIONALITY_EDEFAULT = Nationality.GERMAN;

	/**
	 * The cached value of the '{@link #getNationality() <em>Nationality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNationality()
	 * @generated
	 * @ordered
	 */
	protected Nationality nationality = NATIONALITY_EDEFAULT;

	/**
	 * This is true if the Nationality attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nationalityESet;

	/**
	 * The default value of the '{@link #getDateOfBirth() <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfBirth()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_OF_BIRTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOfBirth() <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfBirth()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateOfBirth = DATE_OF_BIRTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, TaskPackage.USER__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.USER__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.USER__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(Gender newGender) {
		Gender oldGender = gender;
		gender = newGender == null ? GENDER_EDEFAULT : newGender;
		boolean oldGenderESet = genderESet;
		genderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.USER__GENDER, oldGender, gender, !oldGenderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGender() {
		Gender oldGender = gender;
		boolean oldGenderESet = genderESet;
		gender = GENDER_EDEFAULT;
		genderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TaskPackage.USER__GENDER, oldGender, GENDER_EDEFAULT, oldGenderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGender() {
		return genderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(boolean newActive) {
		boolean oldActive = active;
		active = newActive;
		boolean oldActiveESet = activeESet;
		activeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.USER__ACTIVE, oldActive, active, !oldActiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActive() {
		boolean oldActive = active;
		boolean oldActiveESet = activeESet;
		active = ACTIVE_EDEFAULT;
		activeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TaskPackage.USER__ACTIVE, oldActive, ACTIVE_EDEFAULT, oldActiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActive() {
		return activeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getTimeOfRegistration() {
		return timeOfRegistration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeOfRegistration(XMLGregorianCalendar newTimeOfRegistration) {
		XMLGregorianCalendar oldTimeOfRegistration = timeOfRegistration;
		timeOfRegistration = newTimeOfRegistration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.USER__TIME_OF_REGISTRATION, oldTimeOfRegistration, timeOfRegistration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(double newWeight) {
		double oldWeight = weight;
		weight = newWeight;
		boolean oldWeightESet = weightESet;
		weightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.USER__WEIGHT, oldWeight, weight, !oldWeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWeight() {
		double oldWeight = weight;
		boolean oldWeightESet = weightESet;
		weight = WEIGHT_EDEFAULT;
		weightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TaskPackage.USER__WEIGHT, oldWeight, WEIGHT_EDEFAULT, oldWeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWeight() {
		return weightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeigth() {
		return heigth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeigth(int newHeigth) {
		int oldHeigth = heigth;
		heigth = newHeigth;
		boolean oldHeigthESet = heigthESet;
		heigthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.USER__HEIGTH, oldHeigth, heigth, !oldHeigthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHeigth() {
		int oldHeigth = heigth;
		boolean oldHeigthESet = heigthESet;
		heigth = HEIGTH_EDEFAULT;
		heigthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TaskPackage.USER__HEIGTH, oldHeigth, HEIGTH_EDEFAULT, oldHeigthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHeigth() {
		return heigthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nationality getNationality() {
		return nationality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNationality(Nationality newNationality) {
		Nationality oldNationality = nationality;
		nationality = newNationality == null ? NATIONALITY_EDEFAULT : newNationality;
		boolean oldNationalityESet = nationalityESet;
		nationalityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.USER__NATIONALITY, oldNationality, nationality, !oldNationalityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNationality() {
		Nationality oldNationality = nationality;
		boolean oldNationalityESet = nationalityESet;
		nationality = NATIONALITY_EDEFAULT;
		nationalityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TaskPackage.USER__NATIONALITY, oldNationality, NATIONALITY_EDEFAULT, oldNationalityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNationality() {
		return nationalityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfBirth(XMLGregorianCalendar newDateOfBirth) {
		XMLGregorianCalendar oldDateOfBirth = dateOfBirth;
		dateOfBirth = newDateOfBirth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.USER__DATE_OF_BIRTH, oldDateOfBirth, dateOfBirth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.USER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskPackage.USER__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaskPackage.USER__TASKS:
				return getTasks();
			case TaskPackage.USER__FIRST_NAME:
				return getFirstName();
			case TaskPackage.USER__LAST_NAME:
				return getLastName();
			case TaskPackage.USER__GENDER:
				return getGender();
			case TaskPackage.USER__ACTIVE:
				return isActive();
			case TaskPackage.USER__TIME_OF_REGISTRATION:
				return getTimeOfRegistration();
			case TaskPackage.USER__WEIGHT:
				return getWeight();
			case TaskPackage.USER__HEIGTH:
				return getHeigth();
			case TaskPackage.USER__NATIONALITY:
				return getNationality();
			case TaskPackage.USER__DATE_OF_BIRTH:
				return getDateOfBirth();
			case TaskPackage.USER__EMAIL:
				return getEmail();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TaskPackage.USER__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case TaskPackage.USER__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case TaskPackage.USER__LAST_NAME:
				setLastName((String)newValue);
				return;
			case TaskPackage.USER__GENDER:
				setGender((Gender)newValue);
				return;
			case TaskPackage.USER__ACTIVE:
				setActive((Boolean)newValue);
				return;
			case TaskPackage.USER__TIME_OF_REGISTRATION:
				setTimeOfRegistration((XMLGregorianCalendar)newValue);
				return;
			case TaskPackage.USER__WEIGHT:
				setWeight((Double)newValue);
				return;
			case TaskPackage.USER__HEIGTH:
				setHeigth((Integer)newValue);
				return;
			case TaskPackage.USER__NATIONALITY:
				setNationality((Nationality)newValue);
				return;
			case TaskPackage.USER__DATE_OF_BIRTH:
				setDateOfBirth((XMLGregorianCalendar)newValue);
				return;
			case TaskPackage.USER__EMAIL:
				setEmail((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TaskPackage.USER__TASKS:
				getTasks().clear();
				return;
			case TaskPackage.USER__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case TaskPackage.USER__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case TaskPackage.USER__GENDER:
				unsetGender();
				return;
			case TaskPackage.USER__ACTIVE:
				unsetActive();
				return;
			case TaskPackage.USER__TIME_OF_REGISTRATION:
				setTimeOfRegistration(TIME_OF_REGISTRATION_EDEFAULT);
				return;
			case TaskPackage.USER__WEIGHT:
				unsetWeight();
				return;
			case TaskPackage.USER__HEIGTH:
				unsetHeigth();
				return;
			case TaskPackage.USER__NATIONALITY:
				unsetNationality();
				return;
			case TaskPackage.USER__DATE_OF_BIRTH:
				setDateOfBirth(DATE_OF_BIRTH_EDEFAULT);
				return;
			case TaskPackage.USER__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TaskPackage.USER__TASKS:
				return tasks != null && !tasks.isEmpty();
			case TaskPackage.USER__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case TaskPackage.USER__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case TaskPackage.USER__GENDER:
				return isSetGender();
			case TaskPackage.USER__ACTIVE:
				return isSetActive();
			case TaskPackage.USER__TIME_OF_REGISTRATION:
				return TIME_OF_REGISTRATION_EDEFAULT == null ? timeOfRegistration != null : !TIME_OF_REGISTRATION_EDEFAULT.equals(timeOfRegistration);
			case TaskPackage.USER__WEIGHT:
				return isSetWeight();
			case TaskPackage.USER__HEIGTH:
				return isSetHeigth();
			case TaskPackage.USER__NATIONALITY:
				return isSetNationality();
			case TaskPackage.USER__DATE_OF_BIRTH:
				return DATE_OF_BIRTH_EDEFAULT == null ? dateOfBirth != null : !DATE_OF_BIRTH_EDEFAULT.equals(dateOfBirth);
			case TaskPackage.USER__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", gender: ");
		if (genderESet) result.append(gender); else result.append("<unset>");
		result.append(", active: ");
		if (activeESet) result.append(active); else result.append("<unset>");
		result.append(", timeOfRegistration: ");
		result.append(timeOfRegistration);
		result.append(", weight: ");
		if (weightESet) result.append(weight); else result.append("<unset>");
		result.append(", heigth: ");
		if (heigthESet) result.append(heigth); else result.append("<unset>");
		result.append(", nationality: ");
		if (nationalityESet) result.append(nationality); else result.append("<unset>");
		result.append(", dateOfBirth: ");
		result.append(dateOfBirth);
		result.append(", email: ");
		result.append(email);
		result.append(')');
		return result.toString();
	}

} //UserImpl
