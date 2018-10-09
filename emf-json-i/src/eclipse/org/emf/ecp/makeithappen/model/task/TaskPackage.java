/**
 */
package eclipse.org.emf.ecp.makeithappen.model.task;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskFactory
 * @model kind="package"
 * @generated
 */
public interface TaskPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "task";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclipse/org/emf/ecp/makeithappen/model/task";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "task";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaskPackage eINSTANCE = eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskPackageImpl.init();

	/**
	 * The meta object id for the '{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.impl.DocumentRootImpl
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TASK = 3;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USER = 4;

	/**
	 * The feature id for the '<em><b>User Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USER_GROUP = 5;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskImpl
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 1;

	/**
	 * The feature id for the '<em><b>Sub Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SUB_TASKS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ASSIGNEE = 3;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DUE_DATE = 4;

	/**
	 * The feature id for the '<em><b>Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DONE = 5;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.impl.UserImpl
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskPackageImpl#getUser()
	 * @generated
	 */
	int USER = 2;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__TASKS = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FIRST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LAST_NAME = 2;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__GENDER = 3;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ACTIVE = 4;

	/**
	 * The feature id for the '<em><b>Time Of Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__TIME_OF_REGISTRATION = 5;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__WEIGHT = 6;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__HEIGTH = 7;

	/**
	 * The feature id for the '<em><b>Nationality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NATIONALITY = 8;

	/**
	 * The feature id for the '<em><b>Date Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DATE_OF_BIRTH = 9;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = 10;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.UserGroupImpl <em>User Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.impl.UserGroupImpl
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskPackageImpl#getUserGroup()
	 * @generated
	 */
	int USER_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP__USERS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP__NAME = 1;

	/**
	 * The number of structural features of the '<em>User Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>User Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eclipse.org.emf.ecp.makeithappen.model.task.Gender <em>Gender</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.Gender
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskPackageImpl#getGender()
	 * @generated
	 */
	int GENDER = 4;

	/**
	 * The meta object id for the '{@link eclipse.org.emf.ecp.makeithappen.model.task.Nationality <em>Nationality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.Nationality
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskPackageImpl#getNationality()
	 * @generated
	 */
	int NATIONALITY = 5;

	/**
	 * The meta object id for the '<em>Date Of Birth</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskPackageImpl#getDateOfBirth()
	 * @generated
	 */
	int DATE_OF_BIRTH = 6;

	/**
	 * The meta object id for the '<em>Gender Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.Gender
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskPackageImpl#getGenderObject()
	 * @generated
	 */
	int GENDER_OBJECT = 7;

	/**
	 * The meta object id for the '<em>Nationality Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.Nationality
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskPackageImpl#getNationalityObject()
	 * @generated
	 */
	int NATIONALITY_OBJECT = 8;


	/**
	 * Returns the meta object for class '{@link eclipse.org.emf.ecp.makeithappen.model.task.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link eclipse.org.emf.ecp.makeithappen.model.task.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link eclipse.org.emf.ecp.makeithappen.model.task.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link eclipse.org.emf.ecp.makeithappen.model.task.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link eclipse.org.emf.ecp.makeithappen.model.task.DocumentRoot#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.DocumentRoot#getTask()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Task();

	/**
	 * Returns the meta object for the containment reference '{@link eclipse.org.emf.ecp.makeithappen.model.task.DocumentRoot#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.DocumentRoot#getUser()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_User();

	/**
	 * Returns the meta object for the containment reference '{@link eclipse.org.emf.ecp.makeithappen.model.task.DocumentRoot#getUserGroup <em>User Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Group</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.DocumentRoot#getUserGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UserGroup();

	/**
	 * Returns the meta object for class '{@link eclipse.org.emf.ecp.makeithappen.model.task.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the containment reference list '{@link eclipse.org.emf.ecp.makeithappen.model.task.Task#getSubTasks <em>Sub Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Tasks</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.Task#getSubTasks()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_SubTasks();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.org.emf.ecp.makeithappen.model.task.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.org.emf.ecp.makeithappen.model.task.Task#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.Task#getDescription()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Description();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.org.emf.ecp.makeithappen.model.task.Task#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assignee</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.Task#getAssignee()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Assignee();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.org.emf.ecp.makeithappen.model.task.Task#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.Task#getDueDate()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_DueDate();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.org.emf.ecp.makeithappen.model.task.Task#isDone <em>Done</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Done</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.Task#isDone()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Done();

	/**
	 * Returns the meta object for class '{@link eclipse.org.emf.ecp.makeithappen.model.task.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the containment reference list '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.User#getTasks()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Tasks();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.User#getFirstName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.User#getLastName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_LastName();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.User#getGender()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Gender();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.User#isActive()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Active();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getTimeOfRegistration <em>Time Of Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Of Registration</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.User#getTimeOfRegistration()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_TimeOfRegistration();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.User#getWeight()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Weight();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getHeigth <em>Heigth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heigth</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.User#getHeigth()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Heigth();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getNationality <em>Nationality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nationality</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.User#getNationality()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Nationality();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getDateOfBirth <em>Date Of Birth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Birth</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.User#getDateOfBirth()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_DateOfBirth();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.org.emf.ecp.makeithappen.model.task.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for class '{@link eclipse.org.emf.ecp.makeithappen.model.task.UserGroup <em>User Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Group</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.UserGroup
	 * @generated
	 */
	EClass getUserGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link eclipse.org.emf.ecp.makeithappen.model.task.UserGroup#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.UserGroup#getUsers()
	 * @see #getUserGroup()
	 * @generated
	 */
	EReference getUserGroup_Users();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.org.emf.ecp.makeithappen.model.task.UserGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.UserGroup#getName()
	 * @see #getUserGroup()
	 * @generated
	 */
	EAttribute getUserGroup_Name();

	/**
	 * Returns the meta object for enum '{@link eclipse.org.emf.ecp.makeithappen.model.task.Gender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.Gender
	 * @generated
	 */
	EEnum getGender();

	/**
	 * Returns the meta object for enum '{@link eclipse.org.emf.ecp.makeithappen.model.task.Nationality <em>Nationality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nationality</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.Nationality
	 * @generated
	 */
	EEnum getNationality();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Date Of Birth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Of Birth</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='DateOfBirth' baseType='http://www.eclipse.org/emf/2003/XMLType#date'"
	 * @generated
	 */
	EDataType getDateOfBirth();

	/**
	 * Returns the meta object for data type '{@link eclipse.org.emf.ecp.makeithappen.model.task.Gender <em>Gender Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Gender Object</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.Gender
	 * @model instanceClass="eclipse.org.emf.ecp.makeithappen.model.task.Gender"
	 *        extendedMetaData="name='Gender:Object' baseType='Gender'"
	 * @generated
	 */
	EDataType getGenderObject();

	/**
	 * Returns the meta object for data type '{@link eclipse.org.emf.ecp.makeithappen.model.task.Nationality <em>Nationality Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Nationality Object</em>'.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.Nationality
	 * @model instanceClass="eclipse.org.emf.ecp.makeithappen.model.task.Nationality"
	 *        extendedMetaData="name='Nationality:Object' baseType='Nationality'"
	 * @generated
	 */
	EDataType getNationalityObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TaskFactory getTaskFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.org.emf.ecp.makeithappen.model.task.impl.DocumentRootImpl
		 * @see eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TASK = eINSTANCE.getDocumentRoot_Task();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USER = eINSTANCE.getDocumentRoot_User();

		/**
		 * The meta object literal for the '<em><b>User Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USER_GROUP = eINSTANCE.getDocumentRoot_UserGroup();

		/**
		 * The meta object literal for the '{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskImpl
		 * @see eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Sub Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__SUB_TASKS = eINSTANCE.getTask_SubTasks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DESCRIPTION = eINSTANCE.getTask_Description();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ASSIGNEE = eINSTANCE.getTask_Assignee();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DUE_DATE = eINSTANCE.getTask_DueDate();

		/**
		 * The meta object literal for the '<em><b>Done</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DONE = eINSTANCE.getTask_Done();

		/**
		 * The meta object literal for the '{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.org.emf.ecp.makeithappen.model.task.impl.UserImpl
		 * @see eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__TASKS = eINSTANCE.getUser_Tasks();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__FIRST_NAME = eINSTANCE.getUser_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__LAST_NAME = eINSTANCE.getUser_LastName();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__GENDER = eINSTANCE.getUser_Gender();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ACTIVE = eINSTANCE.getUser_Active();

		/**
		 * The meta object literal for the '<em><b>Time Of Registration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__TIME_OF_REGISTRATION = eINSTANCE.getUser_TimeOfRegistration();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__WEIGHT = eINSTANCE.getUser_Weight();

		/**
		 * The meta object literal for the '<em><b>Heigth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__HEIGTH = eINSTANCE.getUser_Heigth();

		/**
		 * The meta object literal for the '<em><b>Nationality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NATIONALITY = eINSTANCE.getUser_Nationality();

		/**
		 * The meta object literal for the '<em><b>Date Of Birth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__DATE_OF_BIRTH = eINSTANCE.getUser_DateOfBirth();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_Email();

		/**
		 * The meta object literal for the '{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.UserGroupImpl <em>User Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.org.emf.ecp.makeithappen.model.task.impl.UserGroupImpl
		 * @see eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskPackageImpl#getUserGroup()
		 * @generated
		 */
		EClass USER_GROUP = eINSTANCE.getUserGroup();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_GROUP__USERS = eINSTANCE.getUserGroup_Users();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_GROUP__NAME = eINSTANCE.getUserGroup_Name();

		/**
		 * The meta object literal for the '{@link eclipse.org.emf.ecp.makeithappen.model.task.Gender <em>Gender</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.org.emf.ecp.makeithappen.model.task.Gender
		 * @see eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskPackageImpl#getGender()
		 * @generated
		 */
		EEnum GENDER = eINSTANCE.getGender();

		/**
		 * The meta object literal for the '{@link eclipse.org.emf.ecp.makeithappen.model.task.Nationality <em>Nationality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.org.emf.ecp.makeithappen.model.task.Nationality
		 * @see eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskPackageImpl#getNationality()
		 * @generated
		 */
		EEnum NATIONALITY = eINSTANCE.getNationality();

		/**
		 * The meta object literal for the '<em>Date Of Birth</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskPackageImpl#getDateOfBirth()
		 * @generated
		 */
		EDataType DATE_OF_BIRTH = eINSTANCE.getDateOfBirth();

		/**
		 * The meta object literal for the '<em>Gender Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.org.emf.ecp.makeithappen.model.task.Gender
		 * @see eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskPackageImpl#getGenderObject()
		 * @generated
		 */
		EDataType GENDER_OBJECT = eINSTANCE.getGenderObject();

		/**
		 * The meta object literal for the '<em>Nationality Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.org.emf.ecp.makeithappen.model.task.Nationality
		 * @see eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskPackageImpl#getNationalityObject()
		 * @generated
		 */
		EDataType NATIONALITY_OBJECT = eINSTANCE.getNationalityObject();

	}

} //TaskPackage
