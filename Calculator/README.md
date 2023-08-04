برای اجرای این پروژه به ورژن 17 جاوا نیاز دارید.

فایل `calculator.feature`  که شامل `Scenario` ها و `Scenario Outline‍` های موردنظر می‌باشد در آدرس `Calculator/src/test/resources/features/calculator.feature` قرار دارد.
![image](https://github.com/alrz1999/SE-LAB-3/assets/45371919/b1c38a71-0e82-423b-b7b5-9cf8fbf932b7)

فایل `CalculatorStepdefs.java` که شامل `Step Definition` های مربوط به `Scenario‍` های تعریف‌شده می‌باشد در آدرس `Calculator/src/test/java/calculator/CalculatorStepdefs.java` قرار دارد.
![image](https://github.com/alrz1999/SE-LAB-3/assets/45371919/69bf3a65-f903-4656-873d-8da03fd83a85)

برای اجرای تست‌ها از ظریق `JUnit` می‌توانید از `Calculator/src/test/java/calculator/RunnerTest.java` استفاده کنید.
![image](https://github.com/alrz1999/SE-LAB-3/assets/45371919/95eb2225-27b5-460f-b7d2-c4eefaca8e7d)

نتیحه‌ی اجرای تست‌ها را در تصویر زیر مشاهده می‌کنیم.
![image](https://github.com/alrz1999/SE-LAB-3/assets/45371919/3683f2b5-634d-44c8-ba1f-95b14e239abd)

در این قسمت هم برای یکسری از عملیات ها مثل `0/0` که تعریف نشده است و عملیات هایی از این دست تست هایی اضافه کردیم و برای گرفتن `exeption` تغیراتی در کلاس `CalculatorStepdef` در`before,Given,When,Then` اعمال کردیم.

تست های اضافه شده:

![Screenshot 2023-08-04 191019](https://github.com/morethanwords/tweb/assets/101315890/28967835-221e-4f8f-9971-e3724edb172c)

تغییرات در کلاس `CalculatorStepdef`:

![Screenshot 2023-08-04 191446](https://github.com/alrz1999/SE-LAB-3/assets/101315890/bc22a0b8-f6a9-482d-b1e0-21a14f2b6213)

اجرای برنامه و نتیجه تست ها(برای حالت هایی مثل '0/0' باتوجه به این که تعریف نشده است روی خروجی که باید با تست مطابقت محدودیتی روی خروجی نگذاشته ایم همچنین دامنه عملیات های که انجام میدهیم را به گونه ای تنظیم کردیم که هم ورودی و هم خروجی اعدادی صحیح باشند.)
![Screenshot 2023-08-04 192619](https://github.com/alrz1999/SE-LAB-3/assets/101315890/5da9adbb-9ba8-4243-bf0e-14528b07c04a)
