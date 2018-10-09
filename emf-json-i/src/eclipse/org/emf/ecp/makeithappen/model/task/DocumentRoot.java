/**
 */
package eclipse.org.emf.ecp.makeithappen.model.task;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.DocumentRoot#getTask <em>Task</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.DocumentRoot#getUser <em>User</em>}</li>
 *   <li>{@link eclipse.org.emf.ecp.makeithappen.model.task.DocumentRoot#getUserGroup <em>User Group</em>}</li>
 * </ul>
 *
 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference.
	 * @see #setTask(Task)
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage#getDocumentRoot_Task()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Task' namespace='##targetNamespace'"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.DocumentRoot#getTask <em>Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' containment reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference.
	 * @see #setUser(User)
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage#getDocumentRoot_User()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='User' namespace='##targetNamespace'"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.DocumentRoot#getUser <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' containment reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>User Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Group</em>' containment reference.
	 * @see #setUserGroup(UserGroup)
	 * @see eclipse.org.emf.ecp.makeithappen.model.task.TaskPackage#getDocumentRoot_UserGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UserGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	UserGroup getUserGroup();

	/**
	 * Sets the value of the '{@link eclipse.org.emf.ecp.makeithappen.model.task.DocumentRoot#getUserGroup <em>User Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Group</em>' containment reference.
	 * @see #getUserGroup()
	 * @generated
	 */
	void setUserGroup(UserGroup value);

} // DocumentRoot
