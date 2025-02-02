function libraryFine(d1, m1, y1, d2, m2, y2) {
    // Create Date objects
    const returnDate = new Date(y1, m1 - 1, d1);
    const dueDate = new Date(y2, m2 - 1, d2);

    // Format dates as "YYYYMMDD"
    const formatDate = (date) => 
        date.getFullYear().toString() +
        (date.getMonth() + 1).toString().padStart(2, "0") +
        date.getDate().toString().padStart(2, "0");

    const returnDateStr = formatDate(returnDate);
    const dueDateStr = formatDate(dueDate);

    console.log("Return Date (YYYYMMDD):", returnDateStr);
    console.log("Due Date (YYYYMMDD):", dueDateStr);

    console.log("dueDate <= returnDate:", dueDateStr <= returnDateStr);
}

// Test Cases
libraryFine(22, 1, 2025, 25, 1, 2025); // Expected: dueDate <= returnDate should be TRUE
libraryFine(28, 1, 2025, 25, 1, 2025); // Expected: returnDate > dueDate should be TRUE
