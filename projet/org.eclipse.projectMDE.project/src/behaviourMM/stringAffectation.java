/**
 */
package behaviourMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>string Affectation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourMM.stringAffectation#getReceivedString <em>Received String</em>}</li>
 * </ul>
 *
 * @see behaviourMM.BehaviourMMPackage#getstringAffectation()
 * @model
 * @generated
 */
public interface stringAffectation extends Affectation {
	/**
	 * Returns the value of the '<em><b>Received String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Received String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received String</em>' attribute.
	 * @see #setReceivedString(String)
	 * @see behaviourMM.BehaviourMMPackage#getstringAffectation_ReceivedString()
	 * @model required="true"
	 * @generated
	 */
	String getReceivedString();

	/**
	 * Sets the value of the '{@link behaviourMM.stringAffectation#getReceivedString <em>Received String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received String</em>' attribute.
	 * @see #getReceivedString()
	 * @generated
	 */
	void setReceivedString(String value);

} // stringAffectation
