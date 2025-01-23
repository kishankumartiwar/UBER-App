import re
from PyPDF2 import PdfReader

def extract_text_from_pdf(pdf_path):
    """Extracts text from a PDF file."""
    reader = PdfReader(pdf_path)
    text = ""
    for page in reader.pages:
        text += page.extract_text() or ""  # Handle None if extract_text() returns None
    return text

def find_number_matches(text, range_start, range_end):
    """Finds and counts numbers within a given range in the text."""
    matches = []
    
    # Loop through each number in the specified range
    for number in range(range_start, range_end + 1):
        # Create a regex pattern for the current number
        pattern = re.compile(rf"\b{number}\b")
        
        # Find all matches for the current number
        found_matches = pattern.findall(text)
        
        # Add found matches to the list
        matches.extend(found_matches)

    # Return unique matches and their count
    return list(set(matches)), len(matches)

if __name__ == "__main__":
    pdf_path = r"C:\Users\tiwar\Downloads\NB-2025-01-23-09.pdf"  # Replace with your PDF file path
    range_start = int(input("Enter the start of the range: "))  # Get start of the range from user
    range_end = int(input("Enter the end of the range: "))      # Get end of the range from user

    try:
        # Extract text from the PDF
        pdf_text = extract_text_from_pdf(pdf_path)

        # Find matches within the specified range
        matches, count = find_number_matches(pdf_text, range_start, range_end)

        print(f"Numbers found in the range {range_start}-{range_end}: {matches}")
        print(f"Total matches: {count}")

    except Exception as e:
        print(f"An error occurred: {e}")