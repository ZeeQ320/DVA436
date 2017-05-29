/**
 */
package behaviourMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affectation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourMM.Affectation#getReceivingVariable <em>Receiving Variable</em>}</li>
 * </ul>
 *
 * @see behaviourMM.BehaviourMMPackage#getAffectation()
 * @model abstract="true"
 * @generated
 */
public interface Affectation extends Statement {
	/**
	 * Returns the value of the '<em><b>Receiving Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiving Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiving Variable</em>' containment reference.
	 * @see #setReceivingVariable(Variable)
	 * @see behaviourMM.BehaviourMMPackage#getAffectation_ReceivingVariable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Variable getReceivingVariable();

	/**
	 * Sets the value of the '{@link behaviourMM.Affectation#getReceivingVariable <em>Receiving Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiving Variable</em>' containment reference.
	 * @see #getReceivingVariable()
	 * @generated
	 */
	void setReceivingVariable(Variable value);

} // Affectation
