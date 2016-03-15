Logging 
=======

Logging:
- Accountability
    - Who did it?
- traceability
    - What happend?
- Should be tamperproof, -resistent, -evident (i can tell if someone did)
- Remove logging
    - Send message to other machine to remote computer.
    - Can't delete old logs even if getting access to computer.
- Kind of intrusion detection
    - Looking for anomalies
    - Successful adversaries leave rootkits (tools for getting back in)
    - Integrity check. 
        - Take snapshot of system state (hash) and check if any unexpected changes has been made.
Timing attack:
    - Exploit time used for computing something to guess a secret.
    
Web application security
========================

- Remote file upload
    - Dangerous because someone might execute the files uploaded to the webserver.
        - e.i. upload more .html pages + php script.
- Remote command executing
    - typically run as www-data not root.
    