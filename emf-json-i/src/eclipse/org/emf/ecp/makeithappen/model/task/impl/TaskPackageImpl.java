/**
 */
package eclipse.org.emf.ecp.makeithappen.model.task.impl;

import eclipse.org.emf.ecp.makeithappen.model.task.DocumentRoot;
import eclipse.org.emf.ecp.makeithappen.model.task.Gender;
import eclipse.org.emf.ecp.makeithappen.model.task.Nationality;
import eclipse.org.emf.ecp.makeithappen.model.task.Task;
import eclipse.org.emf.ecp.makeithappen.model.task.TaskFactory;
import eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage;
import eclipse.org.emf.ecp.makeithappen.model.task.User;
import eclipse.org.emf.ecp.makeithappen.model.task.UserGroup;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskPackageImpl extends EPackageImpl implements TaskPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nationalityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateOfBirthEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType genderObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nationalityObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TaskPackageImpl() {
		super(eNS_URI, TaskFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TaskPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TaskPackage init() {
		if (isInited) return (TaskPackage)EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTaskPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TaskPackageImpl theTaskPackage = registeredTaskPackage instanceof TaskPackageImpl ? (TaskPackageImpl)registeredTaskPackage : new TaskPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTaskPackage.createPackageContents();

		// Initialize created meta-data
		theTaskPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTaskPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TaskPackage.eNS_URI, theTaskPackage);
		return theTaskPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Task() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_User() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UserGroup() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_SubTasks() {
		return (EReference)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Name() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Description() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Assignee() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_DueDate() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Done() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Tasks() {
		return (EReference)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_FirstName() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_LastName() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Gender() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Active() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_TimeOfRegistration() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Weight() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Heigth() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Nationality() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_DateOfBirth() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Email() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserGroup() {
		return userGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserGroup_Users() {
		return (EReference)userGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserGroup_Name() {
		return (EAttribute)userGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGender() {
		return genderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNationality() {
		return nationalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDateOfBirth() {
		return dateOfBirthEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGenderObject() {
		return genderObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNationalityObject() {
		return nationalityObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskFactory getTaskFactory() {
		return (TaskFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TASK);
		createEReference(documentRootEClass, DOCUMENT_ROOT__USER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__USER_GROUP);

		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__SUB_TASKS);
		createEAttribute(taskEClass, TASK__NAME);
		createEAttribute(taskEClass, TASK__DESCRIPTION);
		createEAttribute(taskEClass, TASK__ASSIGNEE);
		createEAttribute(taskEClass, TASK__DUE_DATE);
		createEAttribute(taskEClass, TASK__DONE);

		userEClass = createEClass(USER);
		createEReference(userEClass, USER__TASKS);
		createEAttribute(userEClass, USER__FIRST_NAME);
		createEAttribute(userEClass, USER__LAST_NAME);
		createEAttribute(userEClass, USER__GENDER);
		createEAttribute(userEClass, USER__ACTIVE);
		createEAttribute(userEClass, USER__TIME_OF_REGISTRATION);
		createEAttribute(userEClass, USER__WEIGHT);
		createEAttribute(userEClass, USER__HEIGTH);
		createEAttribute(userEClass, USER__NATIONALITY);
		createEAttribute(userEClass, USER__DATE_OF_BIRTH);
		createEAttribute(userEClass, USER__EMAIL);

		userGroupEClass = createEClass(USER_GROUP);
		createEReference(userGroupEClass, USER_GROUP__USERS);
		createEAttribute(userGroupEClass, USER_GROUP__NAME);

		// Create enums
		genderEEnum = createEEnum(GENDER);
		nationalityEEnum = createEEnum(NATIONALITY);

		// Create data types
		dateOfBirthEDataType = createEDataType(DATE_OF_BIRTH);
		genderObjectEDataType = createEDataType(GENDER_OBJECT);
		nationalityObjectEDataType = createEDataType(NATIONALITY_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Task(), this.getTask(), null, "task", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_User(), this.getUser(), null, "user", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UserGroup(), this.getUserGroup(), null, "userGroup", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_SubTasks(), this.getTask(), null, "subTasks", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Assignee(), theXMLTypePackage.getAnyURI(), "assignee", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_DueDate(), theXMLTypePackage.getDateTime(), "dueDate", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Done(), theXMLTypePackage.getBoolean(), "done", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUser_Tasks(), this.getTask(), null, "tasks", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_FirstName(), theXMLTypePackage.getString(), "firstName", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_LastName(), theXMLTypePackage.getString(), "lastName", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Gender(), this.getGender(), "gender", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Active(), theXMLTypePackage.getBoolean(), "active", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_TimeOfRegistration(), theXMLTypePackage.getDateTime(), "timeOfRegistration", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Weight(), theXMLTypePackage.getDouble(), "weight", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Heigth(), theXMLTypePackage.getInt(), "heigth", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Nationality(), this.getNationality(), "nationality", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_DateOfBirth(), this.getDateOfBirth(), "dateOfBirth", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Email(), theXMLTypePackage.getString(), "email", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userGroupEClass, UserGroup.class, "UserGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserGroup_Users(), this.getUser(), null, "users", null, 0, -1, UserGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserGroup_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, UserGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(genderEEnum, Gender.class, "Gender");
		addEEnumLiteral(genderEEnum, Gender.MALE);
		addEEnumLiteral(genderEEnum, Gender.FEMALE);

		initEEnum(nationalityEEnum, Nationality.class, "Nationality");
		addEEnumLiteral(nationalityEEnum, Nationality.GERMAN);
		addEEnumLiteral(nationalityEEnum, Nationality.FRENCH);
		addEEnumLiteral(nationalityEEnum, Nationality.UK);
		addEEnumLiteral(nationalityEEnum, Nationality.US);
		addEEnumLiteral(nationalityEEnum, Nationality.SPANISH);
		addEEnumLiteral(nationalityEEnum, Nationality.ITALIAN);
		addEEnumLiteral(nationalityEEnum, Nationality.RUSSIAN);

		// Initialize data types
		initEDataType(dateOfBirthEDataType, XMLGregorianCalendar.class, "DateOfBirth", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(genderObjectEDataType, Gender.class, "GenderObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nationalityObjectEDataType, Nationality.class, "NationalityObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (dateOfBirthEDataType,
		   source,
		   new String[] {
			   "name", "DateOfBirth",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#date"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_Task(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Task",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_User(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "User",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_UserGroup(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UserGroup",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (genderEEnum,
		   source,
		   new String[] {
			   "name", "Gender"
		   });
		addAnnotation
		  (genderObjectEDataType,
		   source,
		   new String[] {
			   "name", "Gender:Object",
			   "baseType", "Gender"
		   });
		addAnnotation
		  (nationalityEEnum,
		   source,
		   new String[] {
			   "name", "Nationality"
		   });
		addAnnotation
		  (nationalityObjectEDataType,
		   source,
		   new String[] {
			   "name", "Nationality:Object",
			   "baseType", "Nationality"
		   });
		addAnnotation
		  (taskEClass,
		   source,
		   new String[] {
			   "name", "Task",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTask_SubTasks(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "subTasks"
		   });
		addAnnotation
		  (getTask_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getTask_Description(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "description"
		   });
		addAnnotation
		  (getTask_Assignee(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "assignee"
		   });
		addAnnotation
		  (getTask_DueDate(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dueDate"
		   });
		addAnnotation
		  (getTask_Done(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "done"
		   });
		addAnnotation
		  (userEClass,
		   source,
		   new String[] {
			   "name", "User",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUser_Tasks(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tasks"
		   });
		addAnnotation
		  (getUser_FirstName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "firstName"
		   });
		addAnnotation
		  (getUser_LastName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lastName"
		   });
		addAnnotation
		  (getUser_Gender(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "gender"
		   });
		addAnnotation
		  (getUser_Active(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "active"
		   });
		addAnnotation
		  (getUser_TimeOfRegistration(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "timeOfRegistration"
		   });
		addAnnotation
		  (getUser_Weight(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "weight"
		   });
		addAnnotation
		  (getUser_Heigth(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "heigth"
		   });
		addAnnotation
		  (getUser_Nationality(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nationality"
		   });
		addAnnotation
		  (getUser_DateOfBirth(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dateOfBirth"
		   });
		addAnnotation
		  (getUser_Email(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "email"
		   });
		addAnnotation
		  (userGroupEClass,
		   source,
		   new String[] {
			   "name", "UserGroup",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUserGroup_Users(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "users"
		   });
		addAnnotation
		  (getUserGroup_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
	}

} //TaskPackageImpl
