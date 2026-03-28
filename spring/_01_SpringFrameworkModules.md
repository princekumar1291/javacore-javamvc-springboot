🌱 Spring Framework Modules

Spring Framework modular architecture follow karta hai.
Har module specific functionality provide karta hai.

Major layers:

1. Core Container
2. Data Access / Integration
3. Web Layer
4. AOP & Instrumentation
5. Messaging
6. Test

1️⃣ Core Container (Foundation of Spring)
Ye Spring ka base layer hai jiske upar sab modules build hote hain.
Modules:
Core
Beans
Context
SpEL



# Spring Framework Modules

**Spring Framework** ek modular architecture follow karta hai jisme different modules specific functionality provide karte hain.

Major Layers:

<pre class="overflow-visible! px-0!" data-start="303" data-end="416"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>1. Core Container</span><br/><span>2. Data Access / Integration</span><br/><span>3. Web Layer</span><br/><span>4. AOP & Instrumentation</span><br/><span>5. Messaging</span><br/><span>6. Test</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# 1. Core Container

Core container Spring ka foundation hai. Ye **Dependency Injection (DI)** aur **Inversion of Control (IoC)** implement karta hai.

Modules:

* Core
* Beans
* Context
* SpEL

---

## Core Module

Spring ka fundamental functionality provide karta hai.

Features:

* Dependency Injection
* Resource loading
* IoC container
* Utility classes

Example:

<pre class="overflow-visible! px-0!" data-start="793" data-end="883"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span class="ͼt">ApplicationContext</span><span></span><span class="ͼt">context</span><span></span><span class="ͼn">=</span><br/><span></span><span class="ͼn">new</span><span></span><span class="ͼt">ClassPathXmlApplicationContext</span><span>(</span><span class="ͼr">"beans.xml"</span><span>);</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

## Beans Module

Beans module  **object lifecycle manage karta hai** .

Responsibilities:

* Bean creation
* Bean configuration
* Dependency wiring

Example:

<pre class="overflow-visible! px-0!" data-start="1047" data-end="1099"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>@</span><span class="ͼt">Component</span><br/><span class="ͼn">public</span><span></span><span class="ͼn">class</span><span></span><span class="ͼt">UserService</span><span> {</span><br/><br/><span>}</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Spring automatically object create karega.

---

## Context Module

Beans module ko extend karta hai aur enterprise features provide karta hai.

Features:

* ApplicationContext
* Event propagation
* Resource loading
* Internationalization (i18n)

Example:

<pre class="overflow-visible! px-0!" data-start="1358" data-end="1472"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span class="ͼt">AnnotationConfigApplicationContext</span><span></span><span class="ͼt">context</span><span></span><span class="ͼn">=</span><br/><span></span><span class="ͼn">new</span><span></span><span class="ͼt">AnnotationConfigApplicationContext</span><span>(</span><span class="ͼt">AppConfig</span><span class="ͼn">.class</span><span>);</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

## SpEL (Spring Expression Language)

Spring configuration me **expressions use karne ki facility** deta hai.

Example:

<pre class="overflow-visible! px-0!" data-start="1600" data-end="1642"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>@</span><span class="ͼt">Value</span><span>(</span><span class="ͼr">"#{2 + 3}"</span><span>)</span><br/><span class="ͼt">int</span><span></span><span class="ͼt">result</span><span>;</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Use cases:

* Dynamic configuration
* Bean property values
* Conditional logic

---

# 2. Data Access / Integration Layer

Ye layer **database aur external systems integration** ke liye use hota hai.

Modules:

* JDBC
* ORM
* OXM
* JMS

---

## JDBC Module

Traditional JDBC me bahut boilerplate code hota hai. Spring usko simplify karta hai using  **JdbcTemplate** .

Example:

<pre class="overflow-visible! px-0!" data-start="2021" data-end="2090"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span class="ͼt">jdbcTemplate</span><span class="ͼn">.</span><span class="ͼt">query</span><span>(</span><br/><span></span><span class="ͼr">"SELECT * FROM users"</span><span>,</span><br/><span></span><span class="ͼt">rowMapper</span><br/><span>);</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Benefits:

* Automatic connection handling
* Exception translation
* Cleaner code

---

## ORM Module

Object Relational Mapping frameworks integrate karta hai.

Supported frameworks:

* Hibernate
* JPA
* MyBatis

Example:

<pre class="overflow-visible! px-0!" data-start="2316" data-end="2351"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>@</span><span class="ͼt">Entity</span><br/><span class="ͼn">class</span><span></span><span class="ͼt">User</span><span> {</span><br/><br/><span>}</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Purpose:

<pre class="overflow-visible! px-0!" data-start="2363" data-end="2401"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>Java Objects ↔ Database Tables</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

## OXM (Object XML Mapping)

Java objects ko XML me convert karta hai.

Used in:

* SOAP services
* XML APIs

Supported tools:

* JAXB
* XStream

---

## JMS (Java Messaging Service)

Messaging based communication enable karta hai.

Use cases:

* asynchronous communication
* microservices communication
* event-driven architecture

Example message brokers:

* ActiveMQ
* RabbitMQ

---

# 3. Web Layer

Web applications aur REST APIs build karne ke liye use hota hai.

Modules:

* Web
* Servlet
* Portlet
* WebSocket

---

## Web Module

Basic web integration features provide karta hai.

Includes:

* web application context
* file upload support
* REST utilities

---

## Servlet Module (Spring MVC)

Spring MVC framework implement karta hai.

Main component:

<pre class="overflow-visible! px-0!" data-start="3171" data-end="3196"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>DispatcherServlet</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Request flow:

<pre class="overflow-visible! px-0!" data-start="3213" data-end="3281"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>Client → DispatcherServlet → Controller → Service → Response</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Example:

<pre class="overflow-visible! px-0!" data-start="3293" data-end="3441"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>@</span><span class="ͼt">RestController</span><br/><span class="ͼn">public</span><span></span><span class="ͼn">class</span><span></span><span class="ͼt">UserController</span><span> {</span><br/><br/><span> @</span><span class="ͼt">GetMapping</span><span>(</span><span class="ͼr">"/users"</span><span>)</span><br/><span></span><span class="ͼn">public</span><span></span><span class="ͼt">List</span><span><</span><span class="ͼt">User</span><span>> </span><span class="ͼt">getUsers</span><span>(){</span><br/><span></span><span class="ͼn">return</span><span></span><span class="ͼt">service</span><span class="ͼn">.</span><span class="ͼt">getUsers</span><span>();</span><br/><span> }</span><br/><br/><span>}</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

## Portlet Module

Portlet-based web applications support karta hai.

Mostly **legacy portal systems** me use hota hai.

---

## WebSocket Module

Real-time communication enable karta hai.

Use cases:

* chat applications
* live notifications
* trading dashboards

Example:

<pre class="overflow-visible! px-0!" data-start="3723" data-end="3747"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>ws://server/chat</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# 4. AOP and Instrumentation

Cross-cutting concerns handle karta hai.

Modules:

* AOP
* Aspect
* Instrumentation

---

## AOP (Aspect Oriented Programming)

Common functionality ko separate karta hai.

Examples:

* logging
* security
* transaction management

Example:

<pre class="overflow-visible! px-0!" data-start="4026" data-end="4141"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>@</span><span class="ͼt">Aspect</span><br/><span class="ͼn">public</span><span></span><span class="ͼn">class</span><span></span><span class="ͼt">LoggingAspect</span><span> {</span><br/><br/><span> @</span><span class="ͼt">Before</span><span>(</span><span class="ͼr">"execution(* service.*(..))"</span><span>)</span><br/><span></span><span class="ͼn">public</span><span></span><span class="ͼn">void</span><span></span><span class="ͼt">log</span><span>(){</span><br/><br/><span> }</span><br/><br/><span>}</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

## Aspect Module

AspectJ framework ke saath integration provide karta hai.

Used for:

* advanced AOP features
* compile-time weaving

---

## Instrumentation

JVM level class instrumentation support karta hai.

Use cases:

* runtime monitoring
* performance tracking

---

# 5. Messaging Module

Event-driven communication support karta hai.

Supports:

* message brokers
* asynchronous messaging
* event streaming

Popular integrations:

* Kafka
* RabbitMQ

Example architecture:

<pre class="overflow-visible! px-0!" data-start="4632" data-end="4676"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>Producer → Message Broker → Consumer</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# 6. Test Module

Spring applications ke testing ke liye support provide karta hai.

Integration with:

* JUnit
* TestNG

Features:

* mock objects
* integration testing
* context loading

Example:

<pre class="overflow-visible! px-0!" data-start="4882" data-end="4936"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>@</span><span class="ͼt">SpringBootTest</span><br/><span class="ͼn">class</span><span></span><span class="ͼt">UserServiceTest</span><span> {</span><br/><br/><span>}</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Spring Architecture Overview

<pre class="overflow-visible! px-0!" data-start="4975" data-end="5090"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>Application</span><br/><span>   │</span><br/><span>Spring MVC / Web Layer</span><br/><span>   │</span><br/><span>Service Layer</span><br/><span>   │</span><br/><span>Data Access Layer</span><br/><span>   │</span><br/><span>Core Container (IoC)</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Cross-cutting features:

<pre class="overflow-visible! px-0!" data-start="5117" data-end="5147"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>AOP</span><br/><span>Messaging</span><br/><span>Security</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Testing:

<pre class="overflow-visible! px-0!" data-start="5159" data-end="5188"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>Spring Test Framework</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Summary

| Layer          | Purpose                         |
| -------------- | ------------------------------- |
| Core Container | Dependency Injection and IoC    |
| Data Access    | Database integration            |
| Web Layer      | Web applications and REST APIs  |
| AOP            | Logging, transactions, security |
| Messaging      | Async communication             |
| Test           | Application testing             |
