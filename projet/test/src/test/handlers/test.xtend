package test.handlers

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess


import structureMM.Class
import structureMM.Attribute
import structureMM.doubleAttribute
import structureMM.intAttribute
import structureMM.charAttribute
import structureMM.stringAttribute
import structureMM.boolAttribute
import structureMM.Method
import structureMM.doubleMethod
import structureMM.intMethod
import structureMM.charMethod
import structureMM.stringMethod
import structureMM.boolMethod
import behaviourMM.Statement
import behaviourMM.Variable
import behaviourMM.Loop
import behaviourMM.Conditionnal
import behaviourMM.Affectation
import behaviourMM.writeConsole
import behaviourMM.intVariable
import behaviourMM.doubleVariable
import behaviourMM.charVariable
import behaviourMM.boolVariable
import behaviourMM.stringVariable
import behaviourMM.forLoop
import behaviourMM.ifConditionnal
import behaviourMM.elseConditionnal
import behaviourMM.operationAffectation
import behaviourMM.intAffectation
import behaviourMM.doubleAffectation
import behaviourMM.charAffectation
import behaviourMM.stringAffectation
import behaviourMM.boolAffectation
import behaviourMM.variableAffectation
import behaviourMM.additionOperator
import behaviourMM.multiplicationOperator
import behaviourMM.soustractionOperator
import behaviourMM.divisionOperator
import behaviourMM.equalOperator
import behaviourMM.inferiorOperator
import behaviourMM.superiorOperator
import behaviourMM.inferiorOrEqualOperator
import behaviourMM.superiorOrEqualOperator
import behaviourMM.andOperator
import behaviourMM.orOperator
import behaviourMM.noOperator

class test implements IGenerator {
	
	def getType(Attribute a) {
    	
    	if (a instanceof doubleAttribute) {
    		return "double"
    	} else if (a instanceof intAttribute) {
    		return "int"
    	} else if (a instanceof boolAttribute) {
    		return "bool"
    	} else if (a instanceof charAttribute) {
    		return "char"
    	} else if (a instanceof stringAttribute) {
    		return "string"
    	}
    }
    
    def getType(Method m) {
    	
    	if (m instanceof doubleMethod) {
    		return "double"
    	} else if (m instanceof intMethod) {
    		return "int"
    	} else if (m instanceof boolMethod) {
    		return "bool"
    	} else if (m instanceof charMethod) {
    		return "char"
    	} else if (m instanceof stringMethod) {
    		return "string"
    	}
    	
    }
		
	def getInputs(Method m) {
		
		var buffer = new StringBuffer
		
		for (var i = 0; i < m.inputs.length; i++) {
			buffer.append(getType(m.inputs.get(i)))
			buffer.append(" ")
			buffer.append(m.inputs.get(i).name)
			if(i != m.inputs.length) {
				buffer.append(", ")
			}
		}
		
		return buffer.toString
		
	}
			
	def getType(Variable v) {
		
		if (v instanceof doubleVariable) {
    		return "double"
    	} else if (v instanceof intVariable) {
    		return "int"
    	} else if (v instanceof boolVariable) {
    		return "bool"
    	} else if (v instanceof charVariable) {
    		return "char"
    	} else if (v instanceof stringVariable) {
    		return "string"
    	}
		
	}	
	
	def getFor(forLoop f) '''
	
		for(�f.startValue�, �f.iteration�, �f.conditionStop�) {
			
			�FOR s : f.statement�
				
				�getStatements(s)�
				
			�ENDFOR�
			
		}
	
	'''
	
	def getLoop(Loop l) {
		
		if (l instanceof forLoop) {
			getFor(l)
		}
		
	}
	
	def getEqual(equalOperator e) {
		
		if (e.element1.name != null) {
			if (e.element2.name != null) {
				return "�i.receivedOperation.element1.name� == �i.receivedOperation.element2.name�"
			}
			return "�i.receivedOperation.element1.name� == �i.receivedOperation.element2.value�"
		}
		return "�i.receivedOperation.element1.value� == �i.receivedOperation.element2.value�"
		
	}
	
	def getInferior(inferiorOperator i) {
		
		if (i.element1.name != null) {
			if (i.element2.name != null) {
				return "�i.receivedOperation.element1.name� < �i.receivedOperation.element2.name�"
			}
			return "�i.receivedOperation.element1.name� < �i.receivedOperation.element2.value�"
		}
		return "�i.receivedOperation.element1.value� < �i.receivedOperation.element2.value�"
		
	}
	
	def getSuperior(superiorOperator s) {
		
		if (s.element1.name != null) {
			if (s.element2.name != null) {
				return "�i.receivedOperation.element1.name� > �i.receivedOperation.element2.name�"
			}
			return "�i.receivedOperation.element1.name� > �i.receivedOperation.element2.value�"
		}
		return "�i.receivedOperation.element1.value� > �i.receivedOperation.element2.value�"
		
	}
	
	def getSuperiorOrEqual(superiorOrEqualOperator s) {
		
		if (s.element1.name != null) {
			if (s.element2.name != null) {
				return "�i.receivedOperation.element1.name� >= �i.receivedOperation.element2.name�"
			}
			return "�i.receivedOperation.element1.name� >= �i.receivedOperation.element2.value�"
		}
		return "�i.receivedOperation.element1.value� >= �i.receivedOperation.element2.value�"
		
	}
	
	def getInferiorOrEqual(inferiorOrEqualOperator i) {
		
		if (i.element1.name != null) {
			if (i.element2.name != null) {
				return "�i.receivedOperation.element1.name� <= �i.receivedOperation.element2.name�"
			}
			return "�i.receivedOperation.element1.name� <= �i.receivedOperation.element2.value�"
		}
		return "�i.receivedOperation.element1.value� <= �i.receivedOperation.element2.value�"
		
	}
	
	def getOr(orOperator o) {
		
		if (o.element1.name != null) {
			if (o.element2.name != null) {
				return "�i.receivedOperation.element1.name� || �i.receivedOperation.element2.name�"
			}
			return "�i.receivedOperation.element1.name� || �i.receivedOperation.element2.value�"
		}
		return "�i.receivedOperation.element1.value� || �i.receivedOperation.element2.value�"
		
	}
	
	def getAnd(andOperator a) {
		
		if (a.element1.name != null) {
			if (a.element2.name != null) {
				return "�i.receivedOperation.element1.name� && �i.receivedOperation.element2.name�"
			}
			return "�i.receivedOperation.element1.name� && �i.receivedOperation.element2.value�"
		}
		return "�i.receivedOperation.element1.value� && �i.receivedOperation.element2.value�"
		
	}
	
	def getNo(noOperator e) {
		
		if (e.element1.name != null) {
			return "!(�i.receivedOperation.element1.name�)"
		}
		return "!(�i.receivedOperation.element1.value�)"
		
	}
	
	def getCondition(ifConditionnal i) {
		
		var buffer = new StringBuffer
		
		if (i.condition instanceof equalOperator) {
    		buffer.append(getEqual(i.condition as equalOperator))
    	} else if (i.condition instanceof inferiorOperator) {
    		buffer.append(getInferior(i.condition as inferiorOperator))
    	} else if (i.condition instanceof superiorOperator) {
    		buffer.append(getSuperior(i.condition as superiorOperator))
    	} else if (i.condition instanceof superiorOrEqualOperator) {
    		buffer.append(getSuperiorOrEqual(i.condition as superiorOrEqualOperator))
    	} else if (i.condition instanceof inferiorOrEqualOperator) {
    		buffer.append(getInferiorOrEqual(i.condition as inferiorOrEqualOperator))
    	} else if (i.condition instanceof orOperator) {
    		buffer.append(getOr(i.condition as orOperator))
    	} else if (i.condition instanceof andOperator) {
    		buffer.append(getAnd(i.condition as andOperator))
    	} else if (i.condition instanceof noOperator) {
    		buffer.append(getNo(i.condition as noOperator))
    	} 
		
	}
	
	def writeElse(elseConditionnal e) '''
	
		else {
		
			�FOR s : e.statement�
			
    			�getStatements(s)�
			
    		�ENDFOR�
		
		}
		
	'''
	
	def getElse(ifConditionnal i) {
		
		if(i.elseC != null) {
			writeElse(i.elseC)
		}
		
	}
	
	def getIf(ifConditionnal i) '''
	
		if (�getCondition(i)�) {
			
			�FOR s : i.statement�
				
				�getStatements(i)�
				
			�ENDFOR�
			
		} �getElse(i)�
	
	'''
	
	def getConditionnal(Conditionnal c) {
	
		if (c instanceof ifConditionnal) {
			getIf(c)
		}
		
	}

	def getAddition(additionOperator a) {
	
		if (a.element1.name != null) {
			if (a.element2.name != null) {
				return "o.receivingVariable.name� = �o.receivedOperation.element1.name� + �o.receivedOperation.element2.name"
			}
			return "o.receivingVariable.name� = �o.receivedOperation.element1.name� + �o.receivedOperation.element2.value"
		}
		return "o.receivingVariable.name� = �o.receivedOperation.element1.value� + �o.receivedOperation.element2.value"
		
	}
	
	def getSoustraction(soustractionOperator s) {
	
		if (s.element1.name != null) {
			if (s.element2.name != null) {
				return "o.receivingVariable.name� = �o.receivedOperation.element1.name� - �o.receivedOperation.element2.name"
			}
			return "o.receivingVariable.name� = �o.receivedOperation.element1.name� - �o.receivedOperation.element2.value"
		}
		return "o.receivingVariable.name� = �o.receivedOperation.element1.value� - �o.receivedOperation.element2.value"
		
	}
	
	def getMultiplication(multiplicationOperator m) {
	
		if (m.element1.name != null) {
			if (m.element2.name != null) {
				return "o.receivingVariable.name� = �o.receivedOperation.element1.name� * �o.receivedOperation.element2.name"
			}
			return "o.receivingVariable.name� = �o.receivedOperation.element1.name� * �o.receivedOperation.element2.value"
		}
		return "o.receivingVariable.name� = �o.receivedOperation.element1.value� * �o.receivedOperation.element2.value"
		
	}
	
	def getDivision(divisionOperator d) {
	
		if (d.element1.name != null) {
			if (d.element2.name != null) {
				return "o.receivingVariable.name� = �o.receivedOperation.element1.name� / �o.receivedOperation.element2.name"
			}
			return "o.receivingVariable.name� = �o.receivedOperation.element1.name� / �o.receivedOperation.element2.value"
		}
		return "o.receivingVariable.name� = �o.receivedOperation.element1.value� / �o.receivedOperation.element2.value"
		
	}

	def getOperationAff(operationAffectation o) {
		
		var buffer = new StringBuilder
		
		if (o instanceof additionOperator) {
    		buffer.append(getAddition(o))
    	} else if (o instanceof soustractionOperator) {
    		buffer.append(getSoustraction(o))
    	} else if (o instanceof multiplicationOperator) {
    		buffer.append(getMultiplication(o))
    	} else if (o instanceof divisionOperator) {
    		buffer.append(getDivision(o))
    	}
		
		return buffer
		
	}
	
	def getIntAff(intAffectation i) '''
	
		�i.receivingVariable� = �i.receivedInt.toString�;
	
	'''
	
	def getDoubleAff(doubleAffectation d) '''
	
		�d.receivingVariable� = �d.receivedDouble.toString�;
	
	'''
	
	def getBoolAff(boolAffectation b) '''
	
		�b.receivingVariable� = �b.receivedBool.toString�;
	
	'''
	
	def getCharAff(charAffectation c) '''
	
		�c.receivingVariable� = �c.receivedChar.toString�;
	
	'''
	
	def getStringAff(stringAffectation s) '''
	
		�s.receivingVariable� = �s.receivedString�;
	
	'''

	def getVariableAff(variableAffectation v) '''
	
		�v.receivingVariable.name� = �v.receivedVariable.name�;
	
	'''
	
	def getAffectation(Affectation a) {
		
		if (a instanceof operationAffectation) {
    		getOperationAff(a)
    	} else if (a instanceof intAffectation) {
    		getIntAff(a)
    	} else if (a instanceof boolAffectation) {
    		getBoolAff(a)
    	} else if (a instanceof charAffectation) {
    		getCharAff(a)
    	} else if (a instanceof stringAffectation) {
    		getStringAff(a)
    	} else if (a instanceof doubleAffectation) {
    		getDoubleAff(a)
    	} else if (a instanceof variableAffectation) {
    		getVariableAff(a)
    	}
    		
	}
	
	def getConsole(writeConsole w) {
		
	}
	
	def writeConsole(writeConsole w) '''
	
		System.Out.println("�getConsole(w)�");
	
	'''
	
	def getVariable(Statement s) '''
	
		�IF s instanceof Variable�
			�getType(s as Variable)� �s.name�;
		�ENDIF�
	
	'''
			
	def getStatements(Statement s) {
		
		if (s instanceof Loop) {
			getLoop(s)
		} else if (s instanceof Conditionnal) {
			getConditionnal(s)
		} else if (s instanceof Affectation) {
			getAffectation(s)
		} else if (s instanceof writeConsole) {
			writeConsole(s)
		}
		
	}
    
    def compile(Class c) '''
    package �c.name�;
    
    public class �c.name� {
    	
    	�FOR a : c.attributes�
    	
    		// Attributes
    	
    		public �getType(a)� �a.name�
    		
    	�ENDFOR�
    	
    	�FOR m : c.methods�
    		
    		// Methods
    		
    		public �getType(m)� �m.name� (�getInputs(m)�) {
    			
    			// Declaration
    			
    			�FOR s : m.statement�
    				
    				�getVariable(s)�
    				
    			�ENDFOR�
    			
    			// Body
    			
    			�FOR s : m.statement�
    			
    				�getStatements(s)�
    			
    			�ENDFOR�
    		}
    		
    	�ENDFOR�	
    	
    '''
	
	def static main(String[] args) {
    
    }
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
				
}