import jagdx.IDirect3DVertexBuffer;

final class oka {

   static int d;
   static int[] a;
   static int e;
   static int c = -1;
   static int b;


   static final void a(boolean var0, Object[] var1) {
      if(!var0) {
         a(true, (Object[])null, (Object[])null, ((int[])((int[])var1[1]))[2]);
      }

      ++b;
      if(var1 != null && var1.length == 8) {
         oe.a(var1, (int)1);
      } else if(var1 != null && var1.length >= 8) {
         sj.a(1, var1);
      } else if(null != var1 && var1.length == 9) {
         oe.a(var1, (int)1);
      } else if(null != var1 && var1.length == 6) {
         IDirect3DVertexBuffer.Unlock(((long[])((long[])var1[4]))[0]);
      } else if(var1 != null && -8 == ~var1.length) {
         nfa.b(var1, 0);
      } else {
         throw new IllegalStateException();
      }
   }

   static final void a(boolean var0, Object[] var1, Object[] var2, int var3) {
      moa.a((byte)124, var2, (Object[])((Object[])var1[0]));
      if(var0) {
         ++d;
         za.a(var3, -20929, (Object[])((Object[])var1[0]));
      }
   }

   static final int a(float var0, float var1, float var2, byte var3) {
      ++e;
      float var4 = var1 >= 0.0F?var1:-var1;
      if(var3 >= -61) {
         c = 12;
      }

      float var5 = var0 >= 0.0F?var0:-var0;
      float var6 = 0.0F > var2?-var2:var2;
      return var4 < var5 && var6 < var5?(0.0F < var0?0:1):(var4 < var6 && var5 < var6?(var2 > 0.0F?2:3):(0.0F < var1?4:5));
   }

}
