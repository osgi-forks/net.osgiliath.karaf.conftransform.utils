/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.apache.maven.pom._4._0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activation OS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 4.0.0
 * 
 * This is an activator which will detect an operating system's attributes in order to activate its profile.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.maven.pom._4._0.ActivationOS#getName <em>Name</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.ActivationOS#getFamily <em>Family</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.ActivationOS#getArch <em>Arch</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.ActivationOS#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.maven.pom._4._0._0Package#getActivationOS()
 * @model extendedMetaData="name='ActivationOS' kind='elementOnly'"
 * @generated
 */
public interface ActivationOS extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * 
	 * The name of the operating system to be used to activate the profile. This must be an exact match of the <code xmlns="http://maven.apache.org/POM/4.0.0">${os.name}</code> Java property, such as <code xmlns="http://maven.apache.org/POM/4.0.0">Windows XP</code>.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.apache.maven.pom._4._0._0Package#getActivationOS_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.ActivationOS#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * 
	 * The general family of the OS to be used to activate the profile, such as <code xmlns="http://maven.apache.org/POM/4.0.0">windows</code> or <code xmlns="http://maven.apache.org/POM/4.0.0">unix</code>.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Family</em>' attribute.
	 * @see #setFamily(String)
	 * @see org.apache.maven.pom._4._0._0Package#getActivationOS_Family()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='family' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFamily();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.ActivationOS#getFamily <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' attribute.
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(String value);

	/**
	 * Returns the value of the '<em><b>Arch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * 
	 * The architecture of the operating system to be used to activate the profile.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arch</em>' attribute.
	 * @see #setArch(String)
	 * @see org.apache.maven.pom._4._0._0Package#getActivationOS_Arch()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='arch' namespace='##targetNamespace'"
	 * @generated
	 */
	String getArch();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.ActivationOS#getArch <em>Arch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arch</em>' attribute.
	 * @see #getArch()
	 * @generated
	 */
	void setArch(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0
	 * 
	 * The version of the operating system to be used to activate the profile.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.apache.maven.pom._4._0._0Package#getActivationOS_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom._4._0.ActivationOS#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // ActivationOS
