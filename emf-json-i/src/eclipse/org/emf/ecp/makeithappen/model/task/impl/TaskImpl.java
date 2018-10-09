/**
 */
package eclipse.org.emf.ecp.makeithappen.model.task.impl;

import eclipse.org.emf.ecp.makeithappen.model.task.Task;
import eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage;

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
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskImpl#getSubTasks <em>Sub Tasks</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskImpl#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.TaskImpl#isDone <em>Done</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
	/**
	 * The cached value of the '{@link #getSubTasks() <em>Sub Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> subTasks;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssignee() <em>Assignee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignee()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGNEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssignee() <em>Assignee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignee()
	 * @generated
	 * @ordered
	 */
	protected String assignee = ASSIGNEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dueDate = DUE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDone() <em>Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDone()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DONE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDone() <em>Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDone()
	 * @generated
	 * @ordered
	 */
	protected boolean done = DONE_EDEFAULT;

	/**
	 * This is true if the Done attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean doneESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getSubTasks() {
		if (subTasks == null) {
			subTasks = new EObjectContainmentEList<Task>(Task.class, this, TaskPackage.TASK__SUB_TASKS);
		}
		return subTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssignee() {
		return assignee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignee(String newAssignee) {
		String oldAssignee = assignee;
		assignee = newAssignee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__ASSIGNEE, oldAssignee, assignee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDueDate() {
		return dueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDueDate(XMLGregorianCalendar newDueDate) {
		XMLGregorianCalendar oldDueDate = dueDate;
		dueDate = newDueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__DUE_DATE, oldDueDate, dueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDone() {
		return done;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDone(boolean newDone) {
		boolean oldDone = done;
		done = newDone;
		boolean oldDoneESet = doneESet;
		doneESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__DONE, oldDone, done, !oldDoneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDone() {
		boolean oldDone = done;
		boolean oldDoneESet = doneESet;
		done = DONE_EDEFAULT;
		doneESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TaskPackage.TASK__DONE, oldDone, DONE_EDEFAULT, oldDoneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDone() {
		return doneESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskPackage.TASK__SUB_TASKS:
				return ((InternalEList<?>)getSubTasks()).basicRemove(otherEnd, msgs);
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
			case TaskPackage.TASK__SUB_TASKS:
				return getSubTasks();
			case TaskPackage.TASK__NAME:
				return getName();
			case TaskPackage.TASK__DESCRIPTION:
				return getDescription();
			case TaskPackage.TASK__ASSIGNEE:
				return getAssignee();
			case TaskPackage.TASK__DUE_DATE:
				return getDueDate();
			case TaskPackage.TASK__DONE:
				return isDone();
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
			case TaskPackage.TASK__SUB_TASKS:
				getSubTasks().clear();
				getSubTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case TaskPackage.TASK__NAME:
				setName((String)newValue);
				return;
			case TaskPackage.TASK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TaskPackage.TASK__ASSIGNEE:
				setAssignee((String)newValue);
				return;
			case TaskPackage.TASK__DUE_DATE:
				setDueDate((XMLGregorianCalendar)newValue);
				return;
			case TaskPackage.TASK__DONE:
				setDone((Boolean)newValue);
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
			case TaskPackage.TASK__SUB_TASKS:
				getSubTasks().clear();
				return;
			case TaskPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TaskPackage.TASK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TaskPackage.TASK__ASSIGNEE:
				setAssignee(ASSIGNEE_EDEFAULT);
				return;
			case TaskPackage.TASK__DUE_DATE:
				setDueDate(DUE_DATE_EDEFAULT);
				return;
			case TaskPackage.TASK__DONE:
				unsetDone();
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
			case TaskPackage.TASK__SUB_TASKS:
				return subTasks != null && !subTasks.isEmpty();
			case TaskPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TaskPackage.TASK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TaskPackage.TASK__ASSIGNEE:
				return ASSIGNEE_EDEFAULT == null ? assignee != null : !ASSIGNEE_EDEFAULT.equals(assignee);
			case TaskPackage.TASK__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? dueDate != null : !DUE_DATE_EDEFAULT.equals(dueDate);
			case TaskPackage.TASK__DONE:
				return isSetDone();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", assignee: ");
		result.append(assignee);
		result.append(", dueDate: ");
		result.append(dueDate);
		result.append(", done: ");
		if (doneESet) result.append(done); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TaskImpl
