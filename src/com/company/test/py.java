SELECT
        users.id AS wallet,
        COALESCE(outgoing.outgoing_count, 0) AS outgoing,
        COALESCE(incoming.incoming_count, 0) AS incoming,
        COALESCE(incoming.incoming_sum, 0) - COALESCE(outgoing.outgoing_sum, 0) AS balance
        FROM
        (SELECT DISTINCT sender AS id FROM transactions
        UNION
        SELECT DISTINCT recipient AS id FROM transactions) users
        LEFT JOIN
        (SELECT sender,
        COUNT(*) AS outgoing_count,
        SUM(amount) AS outgoing_sum
        FROM transactions
        GROUP BY sender) outgoing ON users.id = outgoing.sender
        LEFT JOIN
        (SELECT recipient,
        COUNT(*) AS incoming_count,
        SUM(amount) AS incoming_sum
        FROM transactions
        GROUP BY recipient) incoming ON users.id = incoming.recipient;
