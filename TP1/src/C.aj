public aspect C {

    pointcut tracePrint():
            call(public void *.print(String)) ||
            execution(public void B.print(String));

    before(): tracePrint() {
        System.out.printf("Caller : %s, callee : %s, methodName: %s, params : %s\n\n", thisJoinPoint.getThis(), thisJoinPoint.getTarget().toString(), thisJoinPoint.getSignature().getName(), thisJoinPoint.getArgs());
    }
}
