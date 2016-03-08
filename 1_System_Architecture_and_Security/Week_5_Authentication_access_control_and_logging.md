## Last time
### Adversary motivation:
- Confidentiality
    - Weak crypto.
    - Information leak (heartbleed)
    - Privilige elevation
    
- Availability
    - make the system crash

### Administrators motivation:
- To preserve all of CIAA.
- Prevent the adversary from getting root access.

Hardening:
- Minimum exposure
    - Disable all services that isn't needed.
- upgrade all known vulnerbilities of OS and network services.
    - Easy for adversary to do a google search for them.
- Compartmentalise services using local access control
    - Firewall should make sure only local services access services like "print service" (MAC)
- Perform on network services

Authentication & Access control
==============================

## Buffer overflow

- Privilege elevation

buffer overflow attack
- Overwrite back stack to return to adversary function instead of intented function.
- Somewhat mitigated by modern compilers, languages.

1. Authentication
    - Verify claim about identity
    - Unforgable
        - Should not be able to fake
    - Revocable
        - Should be able to cancel login
    - Non-reputable
        - A principle cannot disavoew succesful authentification.
2. 2-factor authentication
    - Something you know + something you have + (something you are)
        - nemId: password + checkcard
        - something you are can be hard to revoke
3. Certificates
    - Use public key to verify is signed by CA private key.
4. Phone fingerprint

Access Control:
- Controlling the authorized actions of an authenticated user/proces.
 

Logging
=======