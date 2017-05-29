/**
 */
package behaviourMM.impl;

import behaviourMM.BehaviourMMPackage;
import behaviourMM.Variable;
import behaviourMM.variableAffectation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>variable Affectation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviourMM.impl.variableAffectationImpl#getReceivedVariable <em>Received Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class variableAffectationImpl extends AffectationImpl implements variableAffectation {
	/**
	 * The cached value of the '{@link #getReceivedVariable() <em>Received Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable receivedVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected variableAffectationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourMMPackage.Literals.VARIABLE_AFFECTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getReceivedVariable() {
		return receivedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceivedVariable(Variable newReceivedVariable, NotificationChain msgs) {
		Variable oldReceivedVariable = receivedVariable;
		receivedVariable = newReceivedVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourMMPackage.VARIABLE_AFFECTATION__RECEIVED_VARIABLE, oldReceivedVariable, newReceivedVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivedVariable(Variable newReceivedVariable) {
		if (newReceivedVariable != receivedVariable) {
			NotificationChain msgs = null;
			if (receivedVariable != null)
				msgs = ((InternalEObject)receivedVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourMMPackage.VARIABLE_AFFECTATION__RECEIVED_VARIABLE, null, msgs);
			if (newReceivedVariable != null)
				msgs = ((InternalEObject)newReceivedVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourMMPackage.VARIABLE_AFFECTATION__RECEIVED_VARIABLE, null, msgs);
			msgs = basicSetReceivedVariable(newReceivedVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourMMPackage.VARIABLE_AFFECTATION__RECEIVED_VARIABLE, newReceivedVariable, newReceivedVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourMMPackage.VARIABLE_AFFECTATION__RECEIVED_VARIABLE:
				return basicSetReceivedVariable(null, msgs);
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
			case BehaviourMMPackage.VARIABLE_AFFECTATION__RECEIVED_VARIABLE:
				return getReceivedVariable();
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
			case BehaviourMMPackage.VARIABLE_AFFECTATION__RECEIVED_VARIABLE:
				setReceivedVariable((Variable)newValue);
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
			case BehaviourMMPackage.VARIABLE_AFFECTATION__RECEIVED_VARIABLE:
				setReceivedVariable((Variable)null);
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
			case BehaviourMMPackage.VARIABLE_AFFECTATION__RECEIVED_VARIABLE:
				return receivedVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //variableAffectationImpl
