function ListDisplay() {
    const users = ["A", "B", "C"];

    return (
        <div>
            {users.map((user, index) => (
                <div key={index}>{user}</div>
            ))}
        </div>
    );
}

export default ListDisplay;