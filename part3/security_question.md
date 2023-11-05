# System Security

We'll be using the OWASP Top 10 2021 as a reference since it provides a comprehensive guide to the most critical security risks to web applications.

## (A01:2021) Broken Access Control:
We have to ensure that the system has robust access controls to prevent unauthorized access to sensitive data and functionality. The 12 software engineers, 3 customer support employees, and the sales employee should have different levels of access. This is done by using role-based access control in Kubernetes and AWS IAM roles to enforce it.

For example: 
*Make sure that customer support employees can only access and modify customer information and orders that are relevant to their tasks and cannot access system configuration or code.
*Ensure that software engineers can access system configuration and code, but only with the minimum privileges required for their roles, and cannot access customer data or orders unless completely necessary.


## (A02:2021) Cryptographic Failures:
This kind of failure can expose important data from the customer; therefore, it is best to always make sure customer data, such as home addresses, telephone numbers, etc., is encrypted at rest and in transit using a strong encryption scheme and a secure key management system. This includes ensuring that all passwords are hashed and salted before being stored in the database. It is never good to store unhashed passwords.


## (A03:2021) Injection:
The Python backend and MySQL database could be vulnerable to injection attacks. It is very important to ensure that all queries or commands, such as to the database or the operating system, are parameterized or escaped to prevent the injection of malicious code or SQL injection. Always validate and sanitize all user input before it is processed by the backend or the database.


## (A04:2021) Insecure Design:
There are multiple strategies that can be used to minimize the potential security issues. First and foremost, promote secure coding practices among the developers; this involves providing training and resources to educate the development team about common security vulnerabilities and best practices for writing secure code. Afterwards, ensure that the system has adopted secure design patterns and frameworks, such as the principle of least privilege, defense in depth, fail securely, etc., to enhance the security of the system architecture and components.

## (A05:2021) Security Misconfiguration:
The team should regularly review the AWS and Kubernetes configurations to avoid security misconfigurations. Ensure that the AWS S3 buckets are not publicly accessible unless necessary. Always check that Kubernetes containers are configured with the minimum permissions and resources required for their functions and are isolated from each other and from the host system. Last but not least, make sure that all software is kept up-to-date with the latest security patches to avoid vulnerabilities.


## (A06:2021) Vulnerable and Outdated Components:
Check if the system uses any vulnerable or outdated components, such as libraries, frameworks, or dependencies, that could introduce security risks or flaws into the system. Once again, verify that the system uses the latest and most secure versions of all components and regularly scan and update them to fix any known vulnerabilities. It is very important for all the system components to be up-to-date.


## (A07:2021) Identification and Authentication Failures:
Identification and authentication failures, such as weak or broken authentication mechanisms, insecure credential management, or insufficient session management, could allow attackers to impersonate or compromise user accounts; therefore, it is important to ensure that the system uses secure authentication methods, such as multi-factor authentication or passwordless authentication, and that it protects against common authentication attacks, such as brute force, credential stuffing, or phishing.


## (A08:2021) Software and Data Integrity Failures:
Verify that the system uses digital signatures, checksums, or hashes to verify the integrity and authenticity of software and data, and that it detects and prevents any unauthorized or malicious modifications or deletions. Ensure that a software supply chain security tool, such as OWASP Dependency Check or OWASP CycloneDX, is used to verify that components do not contain known vulnerabilities as well as verify that unsigned or unencrypted serialized data is not sent to untrusted clients without some form of integrity check or digital signature to detect tampering or replay of the serialized data.


## (A09:2021) Security Logging and Monitoring Failures:
Ensure that all system activity is logged and that logs are monitored for suspicious activity. Make sure that relevant events, such as logins, failed logins, and high-value transactions, are always logged, as well as checking that log data is encoded correctly to prevent injections or attacks on the logging or monitoring systems. Then, use penetration testing and scans by dynamic application security testing (DAST) tools to detect anomalies.


## (A10:2021) Server-Side Request Forgery:
Check if the system is vulnerable to server-side request forgery attacks, which could allow attackers to make requests from the system to other systems, such as internal or external servers, networks, or services. Verify that the system does not accept or process any untrusted URLs. For this purpose, use a well-tested and maintained URL parser to avoid issues caused by URL parsing inconsistencies. Validate that the system uses whitelists, blacklists, or filters to validate and sanitize any input that could be used to make requests.
