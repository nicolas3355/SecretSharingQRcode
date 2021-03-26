# SecretSharingQRcode


An offline android application for splitting and combining QrCodes.

Splits a QrCode (using Shamir Secret Sharing) among n QrCodes according to a certain threshold t, such that any subset of size t of those n QrCodes can recosntruct the original QrCode.
Any set of QrCodes with cardinality less than t cannot reveal any information about the original QrCode.
