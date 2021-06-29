<?xml version="1.0" encoding="UTF-8"?>

-<beans xsi:schemaLocation="http://www.springframework.org/schema/beans https://www.springframework.org/schema/beans/spring-beans.xsd" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://www.springframework.org/schema/beans">


-<bean scope="prototype" class="com.cognizant.springlearn.entity.Country" id="in">

<property value="IN" name="code"/>

<property value="India" name="name"/>

</bean>


-<bean scope="prototype" class="com.cognizant.springlearn.entity.Country" id="us">

<property value="US" name="code"/>

<property value="United States" name="name"/>

</bean>


-<bean scope="prototype" class="com.cognizant.springlearn.entity.Country" id="de">

<property value="DE" name="code"/>

<property value="Germany" name="name"/>

</bean>


-<bean scope="prototype" class="com.cognizant.springlearn.entity.Country" id="jp">

<property value="JP" name="code"/>

<property value="Japan" name="name"/>

</bean>


-<bean class="java.util.ArrayList" id="countryList">


-<constructor-arg>


-<list>

<ref bean="in"/>

<ref bean="us"/>

<ref bean="de"/>

<ref bean="jp"/>

</list>

</constructor-arg>

</bean>

</beans>