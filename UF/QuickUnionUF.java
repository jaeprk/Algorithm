public class QuickUnionUF
{
    private int id[];

    public QuickUnionUF (int N)
    {
        id = new id[N];
        for (int i = 0; i < N; ++i)
            id[i] = i;
    }

    public boolean connected (int p, int q)
    {
        return root(p) == root(q);
    }

    public viod union (int p, int q)
    {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    private int root (int i)
    {
        while (i != id[i])
            i = id[i];
        return i;
    }
}