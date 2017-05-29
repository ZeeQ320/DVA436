/**
 */
package behaviourMM.impl;

import behaviourMM.Affectation;
import behaviourMM.BehaviourMMPackage;
import behaviourMM.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Affectation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviourMM.impl.AffectationImpl#getReceivingVariable <em>Receiving Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AffectationImpl extends StatementImpl implements Affectation {
	/**
	 * The cached value of the '{@link #getReceivingVariable() <em>Receiving Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivingVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable receivingVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AffectationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourMMPackage.Literals.AFFECTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getReceivingVariable() {
		return receivingVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceivingVariable(Variable newReceivingVariable, NotificationChain msgs) {
		Variable oldReceivingVariable = receivingVariable;
		receivingVariable = newReceivingVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourMMPackage.AFFECTATION__RECEIVING_VARIABLE, oldReceivingVariable, newReceivingVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivingVariable(Variable newReceivingVariable) {
		if (newReceivingVariable != receivingVariable) {
			NotificationChain msgs = null;
			if (receivingVariable != null)
				msgs = ((InternalEObject)receivingVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourMMPackage.AFFECTATION__RECEIVING_VARIABLE, null, msgs);
			if (newReceivingVariable != null)
				msgs = ((InternalEObject)newReceivingVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourMMPackage.AFFECTATION__RECEIVING_VARIABLE, null, msgs);
			msgs = basicSetReceivingVariable(newReceivingVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourMMPackage.AFFECTATION__RECEIVING_VARIABLE, newReceivingVariable, newReceivingVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourMMPackage.AFFECTATION__RECEIVING_VARIABLE:
				return basicSetReceivingVariable(null, msgs);
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
			case BehaviourMMPackage.AFFECTATION__RECEIVING_VARIABLE:
				return getReceivingVariable();
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
			case BehaviourMMPackage.AFFECTATION__RECEIVING_VARIABLE:
				setReceivingVariable((Variable)newValue);
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
			case BehaviourMMPackage.AFFECTATION__RECEIVING_VARIABLE:
				setReceivingVariable((Variable)null);
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
			case BehaviourMMPackage.AFFECTATION__RECEIVING_VARIABLE:
				return receivingVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //AffectationImpl
