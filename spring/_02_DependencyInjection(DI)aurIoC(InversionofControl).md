# Dependency Injection (DI)

## 1. What is Dependency Injection

**Dependency Injection (DI)** ek **design pattern** hai jisme ek class ki dependency us class ke andar create nahi hoti, balki **bahar se provide (inject)** ki jati hai.

Simple words me:

<pre class="overflow-visible! px-0!" data-start="481" data-end="566"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>Object khud dependency create nahi karega.</span><br/><span>Dependency bahar se di jayegi.</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Isse **loose coupling** achieve hoti hai.

---

# Example Classes

## Student Class

<pre class="overflow-visible! px-0!" data-start="653" data-end="734"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span class="ͼn">class</span><span></span><span class="ͼt">Student</span><span> {</span><br/><br/><span></span><span class="ͼt">int</span><span></span><span class="ͼt">id</span><span>;</span><br/><span></span><span class="ͼt">String</span><span></span><span class="ͼt">name</span><span>;</span><br/><span></span><span class="ͼt">Address</span><span></span><span class="ͼt">address</span><span>;</span><br/><br/><span>}</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

## Address Class

<pre class="overflow-visible! px-0!" data-start="754" data-end="859"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span class="ͼn">class</span><span></span><span class="ͼt">Address</span><span> {</span><br/><br/><span></span><span class="ͼt">String</span><span></span><span class="ͼt">street</span><span>;</span><br/><span></span><span class="ͼt">String</span><span></span><span class="ͼt">city</span><span>;</span><br/><span></span><span class="ͼt">String</span><span></span><span class="ͼt">state</span><span>;</span><br/><span></span><span class="ͼt">String</span><span></span><span class="ͼt">country</span><span>;</span><br/><br/><span>}</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Yaha:

<pre class="overflow-visible! px-0!" data-start="868" data-end="911"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>Student → Address par dependent hai</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Isliye  **Address ek dependency hai** .

---

# Without Dependency Injection (Tight Coupling)

Agar class khud dependency create kare:

<pre class="overflow-visible! px-0!" data-start="1047" data-end="1146"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span class="ͼn">class</span><span></span><span class="ͼt">Student</span><span> {</span><br/><br/><span></span><span class="ͼt">int</span><span></span><span class="ͼt">id</span><span>;</span><br/><span></span><span class="ͼt">String</span><span></span><span class="ͼt">name</span><span>;</span><br/><span></span><span class="ͼt">Address</span><span></span><span class="ͼt">address</span><span></span><span class="ͼn">=</span><span></span><span class="ͼn">new</span><span></span><span class="ͼt">Address</span><span>();  </span><br/><br/><span>}</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Problems:

* Tight coupling
* Testing difficult
* Code reuse kam
* Maintain karna mushkil

---

# With Dependency Injection

Dependency  **outside se inject hoti hai** .

<pre class="overflow-visible! px-0!" data-start="1317" data-end="1398"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span class="ͼn">class</span><span></span><span class="ͼt">Student</span><span> {</span><br/><br/><span></span><span class="ͼt">int</span><span></span><span class="ͼt">id</span><span>;</span><br/><span></span><span class="ͼt">String</span><span></span><span class="ͼt">name</span><span>;</span><br/><span></span><span class="ͼt">Address</span><span></span><span class="ͼt">address</span><span>;</span><br/><br/><span>}</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Object creation:

<pre class="overflow-visible! px-0!" data-start="1418" data-end="1505"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span class="ͼt">Address</span><span></span><span class="ͼt">addr</span><span></span><span class="ͼn">=</span><span></span><span class="ͼn">new</span><span></span><span class="ͼt">Address</span><span>();</span><br/><span class="ͼt">Student</span><span></span><span class="ͼt">s</span><span></span><span class="ͼn">=</span><span></span><span class="ͼn">new</span><span></span><span class="ͼt">Student</span><span>();</span><br/><br/><span class="ͼt">s</span><span class="ͼn">.</span><span class="ͼt">address</span><span></span><span class="ͼn">=</span><span></span><span class="ͼt">addr</span><span>;</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Yaha dependency  **inject hui hai** .

---

# IoC (Inversion of Control)

Normally:

<pre class="overflow-visible! px-0!" data-start="1590" data-end="1629"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>Class → Object create karti hai</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

IoC me:

<pre class="overflow-visible! px-0!" data-start="1640" data-end="1683"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>Framework → Object create karta hai</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Spring Framework me **IoC Container** object create karta hai aur inject karta hai.

<pre class="overflow-visible! px-0!" data-start="1770" data-end="1842"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>Spring Container</span><br/><span>      ↓</span><br/><span>Create Object</span><br/><span>      ↓</span><br/><span>Inject Dependency</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Types of Dependency Injection

Dependency Injection  **2 tarike se hoti hai** .

<pre class="overflow-visible! px-0!" data-start="1930" data-end="1982"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>1. Constructor Injection</span><br/><span>2. Setter Injection</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# 1. Constructor Injection

Dependency  **constructor ke through inject hoti hai** .

## Example

<pre class="overflow-visible! px-0!" data-start="2085" data-end="2243"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span class="ͼn">class</span><span></span><span class="ͼt">Student</span><span> {</span><br/><br/><span></span><span class="ͼt">int</span><span></span><span class="ͼt">id</span><span>;</span><br/><span></span><span class="ͼt">String</span><span></span><span class="ͼt">name</span><span>;</span><br/><span></span><span class="ͼt">Address</span><span></span><span class="ͼt">address</span><span>;</span><br/><br/><span></span><span class="ͼn">public</span><span></span><span class="ͼt">Student</span><span>(</span><span class="ͼt">Address</span><span></span><span class="ͼt">address</span><span>) {</span><br/><span></span><span class="ͼq">this</span><span class="ͼn">.</span><span class="ͼt">address</span><span></span><span class="ͼn">=</span><span></span><span class="ͼt">address</span><span>;</span><br/><span>    }</span><br/><br/><span>}</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Object creation:

<pre class="overflow-visible! px-0!" data-start="2263" data-end="2335"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span class="ͼt">Address</span><span></span><span class="ͼt">addr</span><span></span><span class="ͼn">=</span><span></span><span class="ͼn">new</span><span></span><span class="ͼt">Address</span><span>();</span><br/><span class="ͼt">Student</span><span></span><span class="ͼt">s</span><span></span><span class="ͼn">=</span><span></span><span class="ͼn">new</span><span></span><span class="ͼt">Student</span><span>(</span><span class="ͼt">addr</span><span>);</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

### Advantages

* Dependency **mandatory hoti hai**
* Object **immutable** ban sakta hai
* Spring me **recommended approach**

---

# 2. Setter Injection

Dependency  **setter method ke through inject hoti hai** .

## Example

<pre class="overflow-visible! px-0!" data-start="2562" data-end="2728"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span class="ͼn">class</span><span></span><span class="ͼt">Student</span><span> {</span><br/><br/><span></span><span class="ͼt">int</span><span></span><span class="ͼt">id</span><span>;</span><br/><span></span><span class="ͼt">String</span><span></span><span class="ͼt">name</span><span>;</span><br/><span></span><span class="ͼt">Address</span><span></span><span class="ͼt">address</span><span>;</span><br/><br/><span></span><span class="ͼn">public</span><span></span><span class="ͼn">void</span><span></span><span class="ͼt">setAddress</span><span>(</span><span class="ͼt">Address</span><span></span><span class="ͼt">address</span><span>) {</span><br/><span></span><span class="ͼq">this</span><span class="ͼn">.</span><span class="ͼt">address</span><span></span><span class="ͼn">=</span><span></span><span class="ͼt">address</span><span>;</span><br/><span>    }</span><br/><br/><span>}</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Object creation:

<pre class="overflow-visible! px-0!" data-start="2748" data-end="2837"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span class="ͼt">Student</span><span></span><span class="ͼt">s</span><span></span><span class="ͼn">=</span><span></span><span class="ͼn">new</span><span></span><span class="ͼt">Student</span><span>();</span><br/><span class="ͼt">Address</span><span></span><span class="ͼt">addr</span><span></span><span class="ͼn">=</span><span></span><span class="ͼn">new</span><span></span><span class="ͼt">Address</span><span>();</span><br/><br/><span class="ͼt">s</span><span class="ͼn">.</span><span class="ͼt">setAddress</span><span>(</span><span class="ͼt">addr</span><span>);</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

### Advantages

* Optional dependency ke liye useful
* Flexible configuration

---

# Constructor vs Setter Injection

| Feature               | Constructor Injection | Setter Injection |
| --------------------- | --------------------- | ---------------- |
| Dependency            | Mandatory             | Optional         |
| Injection Time        | Object creation time  | Later            |
| Immutability          | Possible              | Not possible     |
| Spring Recommendation | Preferred             | Less preferred   |

---

# Real Life Example

Example:

<pre class="overflow-visible! px-0!" data-start="3259" data-end="3284"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>Student → Address</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Student ko address chahiye.

But student khud address create nahi karega.

<pre class="overflow-visible! px-0!" data-start="3361" data-end="3438"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>Spring Container</span><br/><span>      ↓</span><br/><span>Creates Address</span><br/><span>      ↓</span><br/><span>Injects into Student</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Yeh process **Dependency Injection** kehlata hai.

---

# Quick Revision

<pre class="overflow-visible! px-0!" data-start="3514" data-end="3633"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>Dependency Injection</span><br/><span>→ Dependency ko bahar se provide karna</span><br/><br/><span>IoC</span><br/><span>→ Object creation ka control framework ko dena</span></div></div></div></div></div></div></div></div></div></div></div></div></pre>






# Spring Dependency Injection: Data Types (Dependencies)

Spring Framework mein jab hum **Dependency Injection (DI)** karte hain, toh hum teen tarah ke data types ya values inject kar sakte hain. Inhe hi **Dependencies** kaha jata hai.

## 1. Primitive Data Types

Yeh basic values hoti hain jo hum apni classes mein inject karte hain. Inhe Spring XML configuration mein `<value>` tag se ya Java config mein direct assign kiya jata hai.

* **Types:** `byte`, `short`, `char`, `int`, `float`, `double`, `long`, `boolean`.
* **Strings:** String literal values bhi isi category mein treat ki jati hain jab injection ki baat aati hai.
* **Role of IoC Container:** IoC container in literals ko variables mein set karta hai.

**Java**

```
// Example
private int studentId;
private String studentName;
```

---

## 2. Collection Types

Jab ek class ko multiple values ki zaroorat hoti hai (jaise list of phone numbers ya set of addresses), tab hum **Collections** inject karte hain.

Spring niche diye gaye collection types ko support karta hai:

| **Collection Type** | **Description**                                | **XML Tag (Context)** |
| ------------------------- | ---------------------------------------------------- | --------------------------- |
| **List**            | Ordered collection of elements (duplicates allowed). | `<list>`                  |
| **Set**             | Unordered collection of unique elements.             | `<set>`                   |
| **Map**             | Key-Value pairs (e.g., city codes).                  | `<map>`                   |
| **Properties**      | Key-Value pairs jahan dono String hote hain.         | `<props>`                 |

**Example:**

**Java**

```
private List<String> courses;
private Map<String, String> projectDetails;
```

---

## 3. Reference Type (User Defined Objects)

Yeh sabse important part hai. Jab ek class kisi doosri class ke object par dependent hoti hai, toh use **Reference Injection** kehte hain.

* **Meaning:** Ek class ka reference (object) doosri class mein inject karna.
* **Handwritten Note Context:** Isse "User Defined" object bhi kehte hain kyunki yeh classes hum khud banate hain (e.g., `Address`, `Service`, `Repository`).
* **XML Tag:** Iske liye `<ref>` attribute ya tag ka use hota hai.

**Example:**

**Java**

```
public class Student {
    private Address address; // Reference to another class object
}
```

---

## Summary Table: Dependency Types

| **Category**   | **Examples**            | **Usage**                         |
| -------------------- | ----------------------------- | --------------------------------------- |
| **Primitive**  | `int`,`double`,`String` | Basic attributes (Age, Name, ID).       |
| **Collection** | `List`,`Set`,`Map`      | Multiple values (Numbers, Skills).      |
| **Reference**  | `Other class Object`        | Loose coupling (Student needs Address). |





# Spring Dependency Injection: Data Types (Dependencies)

Spring Framework mein jab hum **Dependency Injection (DI)** karte hain, toh hum teen tarah ke data types ya values inject kar sakte hain. Inhe hi **Dependencies** kaha jata hai.

## 1. Primitive Data Types

Yeh basic values hoti hain jo hum apni classes mein inject karte hain. Inhe Spring XML configuration mein `<value>` tag se ya Java config mein direct assign kiya jata hai.

* **Types:** `byte`, `short`, `char`, `int`, `float`, `double`, `long`, `boolean`.
* **Strings:** String literal values bhi isi category mein treat ki jati hain jab injection ki baat aati hai.
* **Role of IoC Container:** IoC container in literals ko variables mein set karta hai.

**Java**

```
// Example
private int studentId;
private String studentName;
```

---

## 2. Collection Types

Jab ek class ko multiple values ki zaroorat hoti hai (jaise list of phone numbers ya set of addresses), tab hum **Collections** inject karte hain.

Spring niche diye gaye collection types ko support karta hai:

| **Collection Type** | **Description**                                | **XML Tag (Context)** |
| ------------------------- | ---------------------------------------------------- | --------------------------- |
| **List**            | Ordered collection of elements (duplicates allowed). | `<list>`                  |
| **Set**             | Unordered collection of unique elements.             | `<set>`                   |
| **Map**             | Key-Value pairs (e.g., city codes).                  | `<map>`                   |
| **Properties**      | Key-Value pairs jahan dono String hote hain.         | `<props>`                 |

**Example:**

**Java**

```
private List<String> courses;
private Map<String, String> projectDetails;
```

---

## 3. Reference Type (User Defined Objects)

Yeh sabse important part hai. Jab ek class kisi doosri class ke object par dependent hoti hai, toh use **Reference Injection** kehte hain.

* **Meaning:** Ek class ka reference (object) doosri class mein inject karna.
* **Handwritten Note Context:** Isse "User Defined" object bhi kehte hain kyunki yeh classes hum khud banate hain (e.g., `Address`, `Service`, `Repository`).
* **XML Tag:** Iske liye `<ref>` attribute ya tag ka use hota hai.

**Example:**

**Java**

```
public class Student {
    private Address address; // Reference to another class object
}
```

---

## Summary Table: Dependency Types

| **Category**   | **Examples**            | **Usage**                         |
| -------------------- | ----------------------------- | --------------------------------------- |
| **Primitive**  | `int`,`double`,`String` | Basic attributes (Age, Name, ID).       |
| **Collection** | `List`,`Set`,`Map`      | Multiple values (Numbers, Skills).      |
| **Reference**  | `Other class Object`        | Loose coupling (Student needs Address). |
