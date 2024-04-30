import React from 'react';

const HomePage = () => {
  // Sample data for transactions
  const transactions = [
    { id: 1, description: 'Groceries', amount: 100, date: '2023-10-01' },
    { id: 2, description: 'Rent', amount: 1200, date: '2023-10-02' },
    { id: 3, description: 'Utilities', amount: 150, date: '2023-10-03' },
  ];

  return (
    <div className="container mx-auto mt-8">
      <h1 className="text-3xl font-bold mb-4">Transactions</h1>
      <table className="w-full border-collapse bg-white">
        <thead>
          <tr>
            <th className="border-b-2 px-4 py-2 text-left">Date</th>
            <th className="border-b-2 px-4 py-2 text-left">Description</th>
            <th className="border-b-2 px-4 py-2 text-left">Amount</th>
          </tr>
        </thead>
        <tbody>
          {transactions.map((transaction) => (
            <tr key={transaction.id}>
              <td className="border-b px-4 py-2">{transaction.date}</td>
              <td className="border-b px-4 py-2">{transaction.description}</td>
              <td className="border-b px-4 py-2">${transaction.amount}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default HomePage;
