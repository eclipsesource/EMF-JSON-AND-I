/**
 */
package eclipse.org.emf.ecp.makeithappen.model.task.impl;

import eclipse.org.emf.ecp.makeithappen.model.task.DocumentRoot;
import eclipse.org.emf.ecp.makeithappen.model.task.Task;
import eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage;
import eclipse.org.emf.ecp.makeithappen.model.task.User;
import eclipse.org.emf.ecp.makeithappen.model.task.UserGroup;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.DocumentRootImpl#getTask <em>Task</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.DocumentRootImpl#getUser <em>User</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.impl.DocumentRootImpl#getUserGroup <em>User Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, TaskPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, TaskPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, TaskPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTask() {
		return (Task)getMixed().get(TaskPackage.Literals.DOCUMENT_ROOT__TASK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask(Task newTask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TaskPackage.Literals.DOCUMENT_ROOT__TASK, newTask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(Task newTask) {
		((FeatureMap.Internal)getMixed()).set(TaskPackage.Literals.DOCUMENT_ROOT__TASK, newTask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUser() {
		return (User)getMixed().get(TaskPackage.Literals.DOCUMENT_ROOT__USER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser(User newUser, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TaskPackage.Literals.DOCUMENT_ROOT__USER, newUser, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(User newUser) {
		((FeatureMap.Internal)getMixed()).set(TaskPackage.Literals.DOCUMENT_ROOT__USER, newUser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserGroup getUserGroup() {
		return (UserGroup)getMixed().get(TaskPackage.Literals.DOCUMENT_ROOT__USER_GROUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserGroup(UserGroup newUserGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TaskPackage.Literals.DOCUMENT_ROOT__USER_GROUP, newUserGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserGroup(UserGroup newUserGroup) {
		((FeatureMap.Internal)getMixed()).set(TaskPackage.Literals.DOCUMENT_ROOT__USER_GROUP, newUserGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case TaskPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case TaskPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case TaskPackage.DOCUMENT_ROOT__TASK:
				return basicSetTask(null, msgs);
			case TaskPackage.DOCUMENT_ROOT__USER:
				return basicSetUser(null, msgs);
			case TaskPackage.DOCUMENT_ROOT__USER_GROUP:
				return basicSetUserGroup(null, msgs);
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
			case TaskPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case TaskPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case TaskPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case TaskPackage.DOCUMENT_ROOT__TASK:
				return getTask();
			case TaskPackage.DOCUMENT_ROOT__USER:
				return getUser();
			case TaskPackage.DOCUMENT_ROOT__USER_GROUP:
				return getUserGroup();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TaskPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case TaskPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case TaskPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case TaskPackage.DOCUMENT_ROOT__TASK:
				setTask((Task)newValue);
				return;
			case TaskPackage.DOCUMENT_ROOT__USER:
				setUser((User)newValue);
				return;
			case TaskPackage.DOCUMENT_ROOT__USER_GROUP:
				setUserGroup((UserGroup)newValue);
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
			case TaskPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case TaskPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case TaskPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case TaskPackage.DOCUMENT_ROOT__TASK:
				setTask((Task)null);
				return;
			case TaskPackage.DOCUMENT_ROOT__USER:
				setUser((User)null);
				return;
			case TaskPackage.DOCUMENT_ROOT__USER_GROUP:
				setUserGroup((UserGroup)null);
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
			case TaskPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case TaskPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case TaskPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case TaskPackage.DOCUMENT_ROOT__TASK:
				return getTask() != null;
			case TaskPackage.DOCUMENT_ROOT__USER:
				return getUser() != null;
			case TaskPackage.DOCUMENT_ROOT__USER_GROUP:
				return getUserGroup() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
