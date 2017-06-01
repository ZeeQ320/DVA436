/**
 */
package behaviourMM.util;

import behaviourMM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see behaviourMM.BehaviourMMPackage
 * @generated
 */
public class BehaviourMMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BehaviourMMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourMMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BehaviourMMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviourMMSwitch<Adapter> modelSwitch =
		new BehaviourMMSwitch<Adapter>() {
			@Override
			public Adapter caseLoop(Loop object) {
				return createLoopAdapter();
			}
			@Override
			public Adapter caseforLoop(forLoop object) {
				return createforLoopAdapter();
			}
			@Override
			public Adapter caseOperator(Operator object) {
				return createOperatorAdapter();
			}
			@Override
			public Adapter caseadditionOperator(additionOperator object) {
				return createadditionOperatorAdapter();
			}
			@Override
			public Adapter casesoustractionOperator(soustractionOperator object) {
				return createsoustractionOperatorAdapter();
			}
			@Override
			public Adapter casemultiplicationOperator(multiplicationOperator object) {
				return createmultiplicationOperatorAdapter();
			}
			@Override
			public Adapter casedivisionOperator(divisionOperator object) {
				return createdivisionOperatorAdapter();
			}
			@Override
			public Adapter caseequalOperator(equalOperator object) {
				return createequalOperatorAdapter();
			}
			@Override
			public Adapter caseinferiorOperator(inferiorOperator object) {
				return createinferiorOperatorAdapter();
			}
			@Override
			public Adapter casesuperiorOperator(superiorOperator object) {
				return createsuperiorOperatorAdapter();
			}
			@Override
			public Adapter caseinferiorOrEqualOperator(inferiorOrEqualOperator object) {
				return createinferiorOrEqualOperatorAdapter();
			}
			@Override
			public Adapter casesuperiorOrEqualOperator(superiorOrEqualOperator object) {
				return createsuperiorOrEqualOperatorAdapter();
			}
			@Override
			public Adapter caseandOperator(andOperator object) {
				return createandOperatorAdapter();
			}
			@Override
			public Adapter caseorOperator(orOperator object) {
				return createorOperatorAdapter();
			}
			@Override
			public Adapter casenoOperator(noOperator object) {
				return createnoOperatorAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseintVariable(intVariable object) {
				return createintVariableAdapter();
			}
			@Override
			public Adapter casedoubleVariable(doubleVariable object) {
				return createdoubleVariableAdapter();
			}
			@Override
			public Adapter caseboolVariable(boolVariable object) {
				return createboolVariableAdapter();
			}
			@Override
			public Adapter casecharVariable(charVariable object) {
				return createcharVariableAdapter();
			}
			@Override
			public Adapter casestringVariable(stringVariable object) {
				return createstringVariableAdapter();
			}
			@Override
			public Adapter caseConditionnal(Conditionnal object) {
				return createConditionnalAdapter();
			}
			@Override
			public Adapter caseifConditionnal(ifConditionnal object) {
				return createifConditionnalAdapter();
			}
			@Override
			public Adapter caseelseConditionnal(elseConditionnal object) {
				return createelseConditionnalAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public Adapter caseAffectation(Affectation object) {
				return createAffectationAdapter();
			}
			@Override
			public Adapter caseoperationAffectation(operationAffectation object) {
				return createoperationAffectationAdapter();
			}
			@Override
			public Adapter casevariableAffectation(variableAffectation object) {
				return createvariableAffectationAdapter();
			}
			@Override
			public Adapter caseintAffectation(intAffectation object) {
				return createintAffectationAdapter();
			}
			@Override
			public Adapter casedoubleAffectation(doubleAffectation object) {
				return createdoubleAffectationAdapter();
			}
			@Override
			public Adapter caseboolAffectation(boolAffectation object) {
				return createboolAffectationAdapter();
			}
			@Override
			public Adapter casecharAffectation(charAffectation object) {
				return createcharAffectationAdapter();
			}
			@Override
			public Adapter casestringAffectation(stringAffectation object) {
				return createstringAffectationAdapter();
			}
			@Override
			public Adapter casereadAffectation(readAffectation object) {
				return createreadAffectationAdapter();
			}
			@Override
			public Adapter casewriteConsole(writeConsole object) {
				return createwriteConsoleAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.Loop
	 * @generated
	 */
	public Adapter createLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.forLoop <em>for Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.forLoop
	 * @generated
	 */
	public Adapter createforLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.Operator
	 * @generated
	 */
	public Adapter createOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.additionOperator <em>addition Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.additionOperator
	 * @generated
	 */
	public Adapter createadditionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.soustractionOperator <em>soustraction Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.soustractionOperator
	 * @generated
	 */
	public Adapter createsoustractionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.multiplicationOperator <em>multiplication Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.multiplicationOperator
	 * @generated
	 */
	public Adapter createmultiplicationOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.divisionOperator <em>division Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.divisionOperator
	 * @generated
	 */
	public Adapter createdivisionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.equalOperator <em>equal Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.equalOperator
	 * @generated
	 */
	public Adapter createequalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.inferiorOperator <em>inferior Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.inferiorOperator
	 * @generated
	 */
	public Adapter createinferiorOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.superiorOperator <em>superior Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.superiorOperator
	 * @generated
	 */
	public Adapter createsuperiorOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.inferiorOrEqualOperator <em>inferior Or Equal Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.inferiorOrEqualOperator
	 * @generated
	 */
	public Adapter createinferiorOrEqualOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.superiorOrEqualOperator <em>superior Or Equal Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.superiorOrEqualOperator
	 * @generated
	 */
	public Adapter createsuperiorOrEqualOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.andOperator <em>and Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.andOperator
	 * @generated
	 */
	public Adapter createandOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.orOperator <em>or Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.orOperator
	 * @generated
	 */
	public Adapter createorOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.noOperator <em>no Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.noOperator
	 * @generated
	 */
	public Adapter createnoOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.intVariable <em>int Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.intVariable
	 * @generated
	 */
	public Adapter createintVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.doubleVariable <em>double Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.doubleVariable
	 * @generated
	 */
	public Adapter createdoubleVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.boolVariable <em>bool Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.boolVariable
	 * @generated
	 */
	public Adapter createboolVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.charVariable <em>char Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.charVariable
	 * @generated
	 */
	public Adapter createcharVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.stringVariable <em>string Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.stringVariable
	 * @generated
	 */
	public Adapter createstringVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.Conditionnal <em>Conditionnal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.Conditionnal
	 * @generated
	 */
	public Adapter createConditionnalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.ifConditionnal <em>if Conditionnal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.ifConditionnal
	 * @generated
	 */
	public Adapter createifConditionnalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.elseConditionnal <em>else Conditionnal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.elseConditionnal
	 * @generated
	 */
	public Adapter createelseConditionnalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.Affectation <em>Affectation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.Affectation
	 * @generated
	 */
	public Adapter createAffectationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.operationAffectation <em>operation Affectation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.operationAffectation
	 * @generated
	 */
	public Adapter createoperationAffectationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.variableAffectation <em>variable Affectation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.variableAffectation
	 * @generated
	 */
	public Adapter createvariableAffectationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.intAffectation <em>int Affectation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.intAffectation
	 * @generated
	 */
	public Adapter createintAffectationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.doubleAffectation <em>double Affectation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.doubleAffectation
	 * @generated
	 */
	public Adapter createdoubleAffectationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.boolAffectation <em>bool Affectation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.boolAffectation
	 * @generated
	 */
	public Adapter createboolAffectationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.charAffectation <em>char Affectation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.charAffectation
	 * @generated
	 */
	public Adapter createcharAffectationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.stringAffectation <em>string Affectation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.stringAffectation
	 * @generated
	 */
	public Adapter createstringAffectationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.readAffectation <em>read Affectation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.readAffectation
	 * @generated
	 */
	public Adapter createreadAffectationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourMM.writeConsole <em>write Console</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourMM.writeConsole
	 * @generated
	 */
	public Adapter createwriteConsoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BehaviourMMAdapterFactory
