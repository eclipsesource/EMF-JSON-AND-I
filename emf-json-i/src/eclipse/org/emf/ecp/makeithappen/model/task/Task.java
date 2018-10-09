/**
 */
package eclipse.org.emf.ecp.makeithappen.model.task;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.Task#getSubTasks <em>Sub Tasks</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.Task#getName <em>Name</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.Task#getDescription <em>Description</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.Task#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.Task#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.Task#isDone <em>Done</em>}</li>
 * </ul>
 *
 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage#getTask()
 * @model extendedMetaData="name='Task' kind='elementOnly'"
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link eclipse.org.emf.ecp.makeithappen.model.task.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Tasks</em>' containment reference list.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage#getTask_SubTasks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subTasks'"
	 * @generated
	 */
	EList<Task> getSubTasks();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage#getTask_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage#getTask_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.Task#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignee</em>' attribute.
	 * @see #setAssignee(String)
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage#getTask_Assignee()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='assignee'"
	 * @generated
	 */
	String getAssignee();

	/**
	 * Sets the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.Task#getAssignee <em>Assignee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignee</em>' attribute.
	 * @see #getAssignee()
	 * @generated
	 */
	void setAssignee(String value);

	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Due Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDueDate(XMLGregorianCalendar)
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage#getTask_DueDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='dueDate'"
	 * @generated
	 */
	XMLGregorianCalendar getDueDate();

	/**
	 * Sets the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.Task#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Done</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Done</em>' attribute.
	 * @see #isSetDone()
	 * @see #unsetDone()
	 * @see #setDone(boolean)
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage#getTask_Done()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='done'"
	 * @generated
	 */
	boolean isDone();

	/**
	 * Sets the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.Task#isDone <em>Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Done</em>' attribute.
	 * @see #isSetDone()
	 * @see #unsetDone()
	 * @see #isDone()
	 * @generated
	 */
	void setDone(boolean value);

	/**
	 * Unsets the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.Task#isDone <em>Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDone()
	 * @see #isDone()
	 * @see #setDone(boolean)
	 * @generated
	 */
	void unsetDone();

	/**
	 * Returns whether the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.Task#isDone <em>Done</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Done</em>' attribute is set.
	 * @see #unsetDone()
	 * @see #isDone()
	 * @see #setDone(boolean)
	 * @generated
	 */
	boolean isSetDone();

} // Task
